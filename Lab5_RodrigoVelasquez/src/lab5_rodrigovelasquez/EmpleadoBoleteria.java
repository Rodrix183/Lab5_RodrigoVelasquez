package lab5_rodrigovelasquez;

import java.util.ArrayList;
import java.util.Date;

public class EmpleadoBoleteria extends Empleado {

    private ArrayList <Pelicula> lista_peliculas = new ArrayList<>();
    
    public EmpleadoBoleteria() {
        super();
    }

    public EmpleadoBoleteria(String nombre, Date fecha, String user, String password, String email, String puesto) {
        super(nombre, fecha, user, password, email, puesto);
    }

    public ArrayList<Pelicula> getLista_peliculas() {
        return lista_peliculas;
    }

    public void setLista_peliculas(ArrayList<Pelicula> lista_peliculas) {
        this.lista_peliculas = lista_peliculas;
    }

    @Override
    public String toString() {
        return "EmpleadoBoleteria{" + "lista_peliculas=" + lista_peliculas + '}';
    }

    
    
    
    
}
