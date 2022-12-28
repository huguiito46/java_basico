package poo.sininterfaces;

import java.util.List;

public class InterfacesMain {

    public static void main(String[] args) {

        EmpleadoCRUDV1 empleadoCRUDV1 = new EmpleadoCRUDV1();

        Empleado hugo = new Empleado("Hugo", 30, 40000, true);
        Empleado patricia = new Empleado("Patricia", 35, 40000, true);
        Empleado juan = new Empleado("Juan", 50, 40000, true);

        // Guardar empleados
        empleadoCRUDV1.save(hugo);
        empleadoCRUDV1.save(patricia);
        empleadoCRUDV1.save(juan);

        // Consultar empleados
        List<Empleado> empleados = empleadoCRUDV1.findAll();
        System.out.println(empleados.toString());


    }

}
