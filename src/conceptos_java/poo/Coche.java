package conceptos_java.poo;

public class Coche {

    // Atributos

    String nombre = "Nombre del coche";

    String color;
    String fabricante;
    String modelo;
    Double peso;
    Double largo;

    Integer velocidad = 0;

    // Constructores


    public Coche(String nombre) {

        this.nombre = nombre;

    }

    public Coche() {


    }

    // Constructores
    public Coche(String color, String fabricante, String modelo, Double peso, Double largo, Integer velocidad) {

        this.color = color;
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.peso = peso;
        this.largo = largo;
        this.velocidad = velocidad;

    }

    // Comportamiento

    public void acelerar(Integer cantidad) {

        if (cantidad > 0 && cantidad <= 120) {
            this.velocidad += cantidad;
        }

    }

    @Override
    public String toString() {
        return "Coche{" +
                "nombre='" + nombre + '\'' +
                '}';
    }
}
