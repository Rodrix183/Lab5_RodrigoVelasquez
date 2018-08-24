package lab5_rodrigovelasquez;

import java.util.Date;

public class Empleado {
    private String nombre;
    private Date fecha;
    private String user;
    private String password;
    private String correo;
    private String puesto;

    public Empleado() {
    }

    public Empleado(String nombre, Date fecha, String user, String password, String correo, String puesto) {
        this.nombre = nombre;
        this.fecha = fecha;
        this.user = user;
        this.password = password;
        this.correo = correo;
        this.puesto = puesto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    @Override
    public String toString() {
        return "Empleado{" + nombre + '}';
    }
    
}
