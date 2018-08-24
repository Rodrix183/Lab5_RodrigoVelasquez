package lab5_rodrigovelasquez;

import java.util.ArrayList;
import java.util.Date;

public class EmpleadoDulceria extends Empleado{

    private ArrayList <Dulce> lista_dulces = new ArrayList<>();
    public EmpleadoDulceria() {
        super();
    }

    public EmpleadoDulceria(String nombre, Date fecha, String user, String password, String email, String puesto) {
        super(nombre, fecha, user, password, email, puesto);
    }

    public ArrayList<Dulce> getLista_dulces() {
        return lista_dulces;
    }

    public void setLista_dulces(ArrayList<Dulce> lista_dulces) {
        this.lista_dulces = lista_dulces;
    }

    @Override
    public String toString() {
        return "Lista Dulces:" + lista_dulces;
    }
    
    

    

}
