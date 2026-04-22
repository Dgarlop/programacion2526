package unidad5.clinica.modelo;

import java.time.LocalDateTime;

public class Cita {
    private int id_cita;
    private int id_medico;     // FK a Medico
    private int id_paciente;   // FK a Paciente
    private LocalDateTime fecha_hora;
    private String motivo;
    private String estado;

    public Cita() {}

    public Cita(int id_cita, int id_medico, int id_paciente,
                LocalDateTime fecha_hora, String motivo, String estado) {
        this.id_cita = id_cita;
        this.id_medico = id_medico;
        this.id_paciente = id_paciente;
        this.fecha_hora = fecha_hora;
        this.motivo = motivo;
        this.estado = estado;
    }

    public int getId_cita() {
        return id_cita;
    }

    public void setId_cita(int id_cita) {
        this.id_cita = id_cita;
    }

    public int getId_medico() {
        return id_medico;
    }

    public void setId_medico(int id_medico) {
        this.id_medico = id_medico;
    }

    public int getId_paciente() {
        return id_paciente;
    }

    public void setId_paciente(int id_paciente) {
        this.id_paciente = id_paciente;
    }

    public LocalDateTime getFecha_hora() {
        return fecha_hora;
    }

    public void setFecha_hora(LocalDateTime fecha_hora) {
        this.fecha_hora = fecha_hora;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Cita{" +
                "id_cita=" + id_cita +
                ", id_medico=" + id_medico +
                ", id_paciente=" + id_paciente +
                ", fecha_hora=" + fecha_hora +
                ", motivo='" + motivo + '\'' +
                ", estado='" + estado + '\'' +
                '}';
    }
}

