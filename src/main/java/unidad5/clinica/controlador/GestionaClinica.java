package unidad5.clinica.controlador;

import unidad5.clinica.config.MySQLConector;
import unidad5.clinica.excepciones.ClinicaException;
import unidad5.clinica.modelo.Cita;
import unidad5.clinica.modelo.Medico;
import unidad5.clinica.modelo.Paciente;
import unidad5.clinica.repositorio.RepositorioCita;
import unidad5.clinica.repositorio.RepositorioMedico;
import unidad5.clinica.repositorio.RepositorioPaciente;

import java.sql.SQLException;
import java.time.LocalDateTime;
import java.util.List;

public class GestionaClinica {

    public static void main(String[] args) {
        MySQLConector conector = new MySQLConector();
        RepositorioMedico repoMedico = new RepositorioMedico(conector);
        RepositorioPaciente repoPaciente = new RepositorioPaciente(conector);
        RepositorioCita repoCita = new RepositorioCita(conector);

        try {
            // Probar conexión básica
            System.out.println("Probando conexión...");
            conector.getConnection().close();
            System.out.println("Conexión OK");

            // Ejercicio 1: listar todos
            List<Medico> medicos = repoMedico.findAll();
            System.out.println("Médicos:");
            medicos.forEach(System.out::println);

            List<Paciente> pacientes = repoPaciente.findAll();
            System.out.println("Pacientes:");
            pacientes.forEach(System.out::println);

            List<Cita> citas = repoCita.findAll();
            System.out.println("Citas:");
            citas.forEach(System.out::println);

            // Ejercicio 2: recuperar paciente por id (manejo de ClinicaException sin parar el programa)
            try {
                Paciente p = repoPaciente.findById(1);
                System.out.println("Paciente con id 1: " + p);
            } catch (ClinicaException ce) {
                System.err.println("Error recuperando paciente: " + ce.getMessage());
            }

            // Ejercicio 3: crear nueva cita
            Cita nueva = new Cita();
            nueva.setId_medico(1);
            nueva.setId_paciente(1);
            nueva.setFecha_hora(LocalDateTime.now().plusDays(1));
            nueva.setMotivo("Revisión general");
            nueva.setEstado(RepositorioCita.ESTADO_PENDIENTE);

            try {
                int idNueva = repoCita.crearCita(nueva);
                System.out.println("Cita creada con ID: " + idNueva);
                System.out.println("Cita: " + nueva);
            } catch (ClinicaException ce) {
                System.err.println("Error creando cita: " + ce.getMessage());
            }

            // Ejercicio 4: actualizar estado de cita
            String nuevoEstado = RepositorioCita.ESTADO_COMPLETADA;
            // Validación en controlador
            if (!nuevoEstado.equals(RepositorioCita.ESTADO_PENDIENTE) &&
                    !nuevoEstado.equals(RepositorioCita.ESTADO_COMPLETADA) &&
                    !nuevoEstado.equals(RepositorioCita.ESTADO_CANCELADA)) {
                throw new IllegalArgumentException("Estado no permitido: " + nuevoEstado);
            }

            try {
                repoCita.actualizarEstadoCita(1, nuevoEstado);
                System.out.println("Estado de la cita 1 actualizado a: " + nuevoEstado);
            } catch (ClinicaException ce) {
                System.err.println("Error actualizando estado de cita: " + ce.getMessage());
            }

            // Ejercicio 5: eliminar médico
            try {
                repoMedico.deleteMedico(2);
                System.out.println("Médico 2 eliminado correctamente");
            } catch (ClinicaException ce) {
                System.err.println("Error eliminando médico: " + ce.getMessage());
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

