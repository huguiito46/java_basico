package makigas_InputStream_OutputStream;

import java.io.Serializable;

public class Empleado implements Serializable {

    private String nombre;
    private String apellido;
    private String profesion;

    public Empleado(){

    }

    public Empleado(String nombre, String apellido, String profesion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.profesion = profesion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", profesion='" + profesion + '\'' +
                '}';
    }
}
