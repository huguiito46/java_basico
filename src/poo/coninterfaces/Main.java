package poo.coninterfaces;

import poo.sininterfaces.Empleado;

/*
 Las implementaciones serían la clase EmpleadoCRUDExcel y EmpleadoCRUDMySQL
 La abstración sería la interfaz EmpleadoCRUD y EmpleadoReader
 */

public class Main {

    static EmpleadoCRUD empleadoCRUD;

    public static void main(String[] args) {

        empleadoCRUD.findAll();
       empleadoCRUD.save(new Empleado());


    }

}
