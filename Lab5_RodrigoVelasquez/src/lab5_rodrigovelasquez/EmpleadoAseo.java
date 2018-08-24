package lab5_rodrigovelasquez;

import java.util.ArrayList;
import java.util.Date;

public class EmpleadoAseo extends Empleado {

    private ArrayList<Funcion> lista_funciones = new ArrayList<>();

    public EmpleadoAseo() {
        super();
    }

    public EmpleadoAseo(String nombre, Date fecha, String user, String password, String email, String puesto) {
        super(nombre, fecha, user, password, email, puesto);
    }

    public ArrayList<Funcion> getLista_funciones() {
        return lista_funciones;
    }

    public void setLista_funciones(ArrayList<Funcion> lista_funciones) {
        this.lista_funciones = lista_funciones;
    }

    @Override
    public String toString() {
        return "Lista Funciones: " + lista_funciones;
    }

    
}
