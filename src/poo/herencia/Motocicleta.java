package poo.herencia;

import poo.clases.Motor;
import poo.clases.Vehiculo;

/*
  Clase derivada o clase hija que hereda los atributos y métodos de la clase padre Vehiculo
 */

public class Motocicleta extends Vehiculo {

    boolean baul;

    public Motocicleta() {

    }

    public Motocicleta(String fabricante, String modelo, int year, Double cc, boolean sport, int speed, Motor motor, boolean baul) {
        super(fabricante, modelo, year, cc, sport, speed, motor);
        this.baul = baul;
    }
}
