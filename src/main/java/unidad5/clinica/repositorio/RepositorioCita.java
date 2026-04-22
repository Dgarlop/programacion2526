package unidad5.clinica.repositorio;

import unidad5.clinica.config.MySQLConector;
import unidad5.clinica.excepciones.ClinicaException;
import unidad5.clinica.modelo.Cita;

import java.sql.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class RepositorioCita {

    public static final String ESTADO_PENDIENTE = "PENDIENTE";
    public static final String ESTADO_COMPLETADA = "COMPLETADA";
    public static final String ESTADO_CANCELADA = "CANCELADA";

    private final MySQLConector conector;

    public RepositorioCita(MySQLConector conector) {
        this.conector = conector;
    }

    // Ejercicio 1: todas las citas
    public List<Cita> findAll() throws SQLException {
        String sql = "SELECT id_cita, id_medico, id_paciente, fecha_hora, motivo, estado FROM cita";
        List<Cita> lista = new ArrayList<>();

        try (Connection con = conector.getConnection();
             PreparedStatement ps = con.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                Cita c = new Cita();
                c.setId_cita(rs.getInt("id_cita"));
                c.setId_medico(rs.getInt("id_medico"));
                c.setId_paciente(rs.getInt("id_paciente"));
                Timestamp ts = rs.getTimestamp("fecha_hora");
                c.setFecha_hora(ts.toLocalDateTime());
                c.setMotivo(rs.getString("motivo"));
                c.setEstado(rs.getString("estado"));
                lista.add(c);
            }
        }
        return lista;
    }

    // Ejercicio 3: alta de nueva cita y devolver ID generado
    public int crearCita(Cita cita) throws SQLException, ClinicaException {
        String sql = "INSERT INTO cita (id_medico, id_paciente, fecha_hora, motivo, estado) " +
                "VALUES (?, ?, ?, ?, ?)";

        try (Connection con = conector.getConnection();
             PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {

            ps.setInt(1, cita.getId_medico());
            ps.setInt(2, cita.getId_paciente());
            ps.setTimestamp(3, Timestamp.valueOf(cita.getFecha_hora()));
            ps.setString(4, cita.getMotivo());
            ps.setString(5, cita.getEstado());

            int filas = ps.executeUpdate();
            if (filas == 0) {
                throw new ClinicaException("No se ha insertado ninguna cita");
            }

            try (ResultSet rs = ps.getGeneratedKeys()) {
                if (rs.next()) {
                    int idGenerado = rs.getInt(1);
                    cita.setId_cita(idGenerado);
                    return idGenerado;
                } else {
                    throw new ClinicaException("No se pudo obtener el ID generado de la cita");
                }
            }
        }
    }

    // Ejercicio 4: modificar estado de una cita existente
    public void actualizarEstadoCita(int idCita, String nuevoEstado) throws SQLException, ClinicaException {
        String sql = "UPDATE cita SET estado = ? WHERE id_cita = ?";

        try (Connection con = conector.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, nuevoEstado);
            ps.setInt(2, idCita);

            int filas = ps.executeUpdate();
            if (filas == 0) {
                throw new ClinicaException("La cita con id " + idCita + " no existe");
            }
        }
    }
}

