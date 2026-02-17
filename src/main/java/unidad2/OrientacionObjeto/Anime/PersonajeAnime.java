package unidad2.OrientacionObjeto.Anime;

import java.util.Objects;

public class PersonajeAnime {
    private String nombre;
    private SerieAnime serieAnime;
    int edad;
    private Transformacion transformacion;

    public void comer(){
        System.out.println("Comiendo");
    }

    public void atacar(){
        System.out.println("Atacando");
    }

    public boolean transformarse(PersonajeAnime origen, PersonajeAnime destino){
        boolean transformacion = true;
        this.transformacion = new Transformacion(origen,destino);
        return transformacion;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        PersonajeAnime that = (PersonajeAnime) o;
        return Objects.equals(nombre, that.nombre) && Objects.equals(serieAnime, that.serieAnime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, serieAnime);
    }

    public PersonajeAnime(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public SerieAnime getSerieAnime() {
        return serieAnime;
    }

    public void setSerieAnime(SerieAnime serieAnime) {
        this.serieAnime = serieAnime;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Transformacion getTransformacion() {
        return transformacion;
    }

    public void setTransformacion(Transformacion transformacion) {
        this.transformacion = transformacion;
    }

    @Override
    public String toString() {
        return "PersonajeAnime{" +
                "nombre='" + nombre + '\'' +
                ", serieAnime=" + serieAnime +
                ", edad=" + edad +
                ", transformacion=" + transformacion +
                '}';
    }
}
