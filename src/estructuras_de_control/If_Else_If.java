package estructuras_de_control;

public class If_Else_If {

    public static void main(String[] args) {

        String dia = "viernes";

        //Ejemplos a comparar//

        boolean resultadoCompararNum = 5 == 5;
        boolean resultado = dia.equals("Lunes");

        if (dia.equals("Lunes")) {

            System.out.println("Es Lunes");

        } else if (dia.equals("Martes")) {

            System.out.println("Es Martes");

        } else if (dia.equals("Miercoles")) {

            System.out.println("Es miércoles");

        } else if (dia.equals("Jueves")) {
            System.out.println("Es jueves");

        } else if (dia.equals("Viernes")) {
            System.out.println("Es viernes de follar!!!!!!");

        } else if (dia.equals("Sabado")) {
            System.out.println("Es sabado ");

        } else if (dia.equals("Domingo")) {
            System.out.println("Post fiesta");
        } else {
            System.out.println("El día no correponde " +
                    dia);
        }


    }
}
