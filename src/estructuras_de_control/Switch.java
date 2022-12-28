package estructuras_de_control;

public class Switch {

    public static void main(String[] args) {

        String dia = "Viernes";

        switch (dia){

            case "Lunes":
                System.out.println("Es Lunes pájaro mucha suerte!!!");
                break;

            case "Martes":
                System.out.println("Hoy es martes!! Animo!!!");

            case "Miércoles":
                System.out.println("Hoy es Miércoles");

            case "Jueves":
                System.out.println("Hoy es Jueves");
                break;

            case "Viernes":
                System.out.println("Hoy es Viernes");
                break;

            case "Sábado":
                System.out.println("Hoy es Sábado");
                break;

            case "Domingo":
                System.out.println("Hoy es Domingo");
                break;

            default:
                System.out.println("El día no corresponde");
        }

    }

}
