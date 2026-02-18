package unidad2.Simulacro;
import java.time.LocalDate;


public class Incidente {
    private int identificador;
    private Equipo nombre;
    private String descripcion;
    private LocalDate fechaApertura;
    private LocalDate fechaCerrado;
    private Estado estado;
    private Criticidad criticidad;

    public void contarIncidnetes(){
        int num = 0;
        num++;
        nombre.setIncidentes(num);
    }

    public Incidente(int identificador, String descripcion, LocalDate fechaCerrado, Estado estado, Criticidad criticidad) {
        this.identificador = identificador;
        this.descripcion = descripcion;
        this.fechaCerrado = fechaCerrado;
        this.estado = estado;
        this.criticidad = criticidad;
        this.fechaApertura = LocalDate.now();
    }

    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public Equipo getNombre() {
        return nombre;
    }

    public void setNombre(Equipo nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public LocalDate getFechaApertura() {
        return fechaApertura;
    }

    public void setFechaApertura(LocalDate fechaApertura) {
        this.fechaApertura = fechaApertura;
    }

    public LocalDate getFechaCerrado() {
        return fechaCerrado;
    }

    public void setFechaCerrado(LocalDate fechaCerrado) {
        this.fechaCerrado = fechaCerrado;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public Criticidad getCriticidad() {
        return criticidad;
    }

    public void setCriticidad(Criticidad criticidad) {
        this.criticidad = criticidad;
    }

    public void esCerrado(){
        if (estado.equals(Estado.CERRADA)){
        }
        else{
            fechaCerrado = null;
        }
    }

    public boolean esUrgente(){
        boolean urgente = false;
        LocalDate hoy = LocalDate.now();
        if (criticidad == Criticidad.CRITICA){
            urgente = true;
        }
        else if (this.criticidad == Criticidad.GRAVE && this.estado != Estado.CERRADA && hoy.minusDays(7).isAfter(this.fechaApertura)){
            urgente = true;
        }
        else if (this.criticidad == Criticidad.MEDIA && this.estado != Estado.CERRADA && hoy.minusDays(30).isAfter(this.fechaApertura)){
            urgente = true;
        }
        else {
            urgente = false;
        }
        return urgente;
    }

    @Override
    public String toString() {
        return "Incidente{" +
                "identificador=" + identificador +
                ", descripcion='" + descripcion + '\'' +
                ", fechaApertura='" + fechaApertura + '\'' +
                ", fechaCerrado='" + fechaCerrado + '\'' +
                ", estado=" + estado +
                ", criticidad=" + criticidad +
                '}';
    }
}
