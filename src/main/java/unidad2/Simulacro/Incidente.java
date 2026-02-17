package unidad2.Simulacro;

public class Incidente {
    private int identificador;
    private Equipo nombre;
    private String descripcion;
    private String fechaApertura;
    private String fechaCerrado;
    private Estado estado;
    private Criticidad criticidad;

    public void contarIncidnetes(){
        int num = 0;
        num++;
        nombre.setIncidentes(num);
    }

    public Incidente(int identificador, String descripcion, String fechaApertura, String fechaCerrado, Estado estado, Criticidad criticidad) {
        this.identificador = identificador;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.fechaApertura = fechaApertura;
        this.fechaCerrado = fechaCerrado;
        this.estado = estado;
        this.criticidad = criticidad;
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

    public String getFechaApertura() {
        return fechaApertura;
    }

    public void setFechaApertura(String fechaApertura) {
        this.fechaApertura = fechaApertura;
    }

    public String getFechaCerrado() {
        return fechaCerrado;
    }

    public void setFechaCerrado(String fechaCerrado) {
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
            fechaCerrado = "";
        }
    }

    public void esUrgente(){
        if (criticidad.equals(Criticidad.CRITICA)){
            System.out.println("Es Urgente");
        }
        else if (criticidad.equals(Criticidad.GRAVE) && fechaCerrado.equals("Null")){
            System.out.println("Es Urgente");
        }
        else {
            System.out.println("No es Urgente");
        }
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
