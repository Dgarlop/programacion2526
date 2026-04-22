package unidad5.clinica.repositorio;

import unidad5.clinica.config.MySQLConector;
import unidad5.clinica.excepciones.ClinicaException;
import unidad5.clinica.modelo.Medico;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class RepositorioMedico {

    private final MySQLConector conector;

    public RepositorioMedico(MySQLConector conector) {
        this.conector = conector;
    }

    // Ejercicio 1: todos los médicos
    public List<Medico> findAll() throws SQLException {
        String sql = "SELECT id_medico, nombre, apellidos, especialidad, telefono, email FROM medico";
        List<Medico> lista = new ArrayList<>();

        try (Connection con = conector.getConnection();
             PreparedStatement ps = con.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                Medico m = new Medico();
                m.setId_medico(rs.getInt("id_medico"));
                m.setNombre(rs.getString("nombre"));
                m.setApellidos(rs.getString("apellidos"));
                m.setEspecialidad(rs.getString("especialidad"));
                m.setTelefono(rs.getString("telefono"));
                m.setEmail(rs.getString("email"));
                lista.add(m);
            }
        }
        return lista;
    }

    // Ejercicio 5: eliminar médico validando citas pendientes
    public void deleteMedico(int idMedico) throws SQLException, ClinicaException {
        String sqlPendientes = "SELECT COUNT(*) FROM cita WHERE id_medico = ? AND estado = 'PENDIENTE'";
        String sqlDelete = "DELETE FROM medico WHERE id_medico = ?";

        try (Connection con = conector.getConnection()) {
            // Validar citas pendientes
            try (PreparedStatement ps = con.prepareStatement(sqlPendientes)) {
                ps.setInt(1, idMedico);
                try (ResultSet rs = ps.executeQuery()) {
                    if (rs.next() && rs.getInt(1) > 0) {
                        throw new ClinicaException("No se puede eliminar: el médico tiene citas pendientes");
                    }
                }
            }

            // Eliminar médico
            try (PreparedStatement psDel = con.prepareStatement(sqlDelete)) {
                psDel.setInt(1, idMedico);
                int filas = psDel.executeUpdate();
                if (filas == 0) {
                    throw new ClinicaException("El médico no existe");
                }
            }
        }
    }
}
