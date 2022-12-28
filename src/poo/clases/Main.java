package poo.clases;


// Clase identificador = new Clase();

import poo.herencia.Camion;
import poo.herencia.Coche;
import poo.herencia.Motocicleta;

/*
  Modificadores

  Static --> Pertenece a esta clase ese método
 */

public class Main {

    public static void main(String[] args) {

        // Clase identificador = new Clase();
        Vehiculo toyotaPrius = new Vehiculo();

        //crear un objeto utilizando el constructor vacio//
        Motor motorGTI = new Motor("GTI", 225, 400.0, 6);

        Vehiculo fordMondeo = new Vehiculo("Ford", "Mondeo", 2010, 2.1, false, 245, motorGTI);

        //Nomenclatura del punto (objeto + propiedad) - pero esto se debe modificar con getter y setter no dentro del objeto

        System.out.println(fordMondeo.fabricante);
        System.out.println(fordMondeo.year);
        System.out.println(fordMondeo.speed); // 0
        fordMondeo.acelerar(50);
        System.out.println(fordMondeo.speed); // 50

        Motocicleta kawasakiNinja = new Motocicleta();
        kawasakiNinja.fabricante = "Suzuki";

        System.out.println("Fin del programa");

        // 3. Poliformismo

        Vehiculo vehiculo;

        vehiculo = new Motocicleta();
        vehiculo.acelerar(50);

        vehiculo = new Coche();
        vehiculo.acelerar(50);

        vehiculo = new Camion();
        vehiculo.acelerar(50);


        // 4. Clases abstractas: no se pueden instaciar, solo instancias las clases hija





    }

}
