package poo.clases;

/*

Public --> Accesible desde otras clases


 */

// Clase base o clase padre//

/*
Composión --> Relacionar clases unas con otras.

 */

public class Vehiculo {

    // 1. Atributos
    protected String fabricante;
    protected String modelo;
    // Double es una clase envoltorio double que a diferencia de los double normales nos permiten almacenar nulos, esto es interesante para bbdd
    protected int year;
    protected Double cc; // centimentros cubicos
    protected boolean sport;
    protected int speed;
    protected Motor motor;

    // 2. Constructores métodos especial que nos permiten construir los objetos a partir de nuestra plantilla

    public Vehiculo() {


    }

    /*
    this.fabricante = fabricante
    Hace referencia al atributo de la clase
     */

    public Vehiculo(String fabricante, String modelo, int year, Double cc, boolean sport, int speed, Motor motor) {
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.year = year;
        this.cc = cc;
        this.sport = sport;
        this.speed = speed;
        this.motor = motor;
    }

    public Vehiculo(String fabricante, String modelo) {

        this.fabricante = fabricante;
        this.modelo = modelo;

    }

    public Vehiculo(String fabricante, String modelo, int year) {
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.year = year;
    }


    /*
    Métodos (comportamiento de nuestros objetos)
     */


    public void acelerar(int cantidad) {

        this.speed += cantidad;


    }


    /*
    Getter y Setter
     */


}
