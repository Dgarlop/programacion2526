package unidad5.clinica.repositorio;

import unidad5.clinica.config.MySQLConector;
import unidad5.clinica.excepciones.ClinicaException;
import unidad5.clinica.modelo.Paciente;

import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class RepositorioPaciente {

    private final MySQLConector conector;

    public RepositorioPaciente(MySQLConector conector) {
        this.conector = conector;
    }

    // Ejercicio 1: todos los pacientes
    public List<Paciente> findAll() throws SQLException {
        String sql = "SELECT id_paciente, nombre, apellidos, fecha_nac, telefono, email FROM paciente";
        List<Paciente> lista = new ArrayList<>();

        try (Connection con = conector.getConnection();
             PreparedStatement ps = con.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                Paciente p = new Paciente();
                p.setId_paciente(rs.getInt("id_paciente"));
                p.setNombre(rs.getString("nombre"));
                p.setApellidos(rs.getString("apellidos"));
                p.setFecha_nac(rs.getDate("fecha_nac").toLocalDate());
                p.setTelefono(rs.getString("telefono"));
                p.setEmail(rs.getString("email"));
                lista.add(p);
            }
        }
        return lista;
    }

    // Ejercicio 2: recuperar un paciente por id (consulta parametrizada)
    public Paciente findById(int idPaciente) throws SQLException, ClinicaException {
        String sql = "SELECT id_paciente, nombre, apellidos, fecha_nac, telefono, email " +
                "FROM paciente WHERE id_paciente = ?";

        try (Connection con = conector.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setInt(1, idPaciente);

            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    Paciente p = new Paciente();
                    p.setId_paciente(rs.getInt("id_paciente"));
                    p.setNombre(rs.getString("nombre"));
                    p.setApellidos(rs.getString("apellidos"));
                    p.setFecha_nac(rs.getDate("fecha_nac").toLocalDate());
                    p.setTelefono(rs.getString("telefono"));
                    p.setEmail(rs.getString("email"));
                    return p;
                } else {
                    throw new ClinicaException("Paciente no encontrado con id: " + idPaciente);
                }
            }
        }
    }
}

