package lab5_rodrigovelasquez;

public class Pelicula {

private String nombre;
private String duracion;
private String clasificacion;
private String categoria;

    public Pelicula() {
    }

    public Pelicula(String nombre, String duracion, String clasificacion, String categoria) {
        this.nombre = nombre;
        this.duracion = duracion;
        this.clasificacion = clasificacion;
        this.categoria = categoria;
    }

    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    public String getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(String clasificacion) {
        this.clasificacion = clasificacion;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return nombre;
    }

    
}
