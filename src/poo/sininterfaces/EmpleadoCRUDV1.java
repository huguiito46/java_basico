package poo.sininterfaces;

import java.util.ArrayList;
import java.util.List;

/*
  * CRUD
  * Read/Retrieve
  * Update
  * Delete
 */


public class EmpleadoCRUDV1 {

    private List<Empleado> empleados = new ArrayList<>(); // Esto es una estructura de datos

    // Create - guardar un empleado
    public void save(Empleado empleado){

        empleados.add(empleado);

    }

    public List<Empleado> findAll(){

        return empleados;

    }


}
