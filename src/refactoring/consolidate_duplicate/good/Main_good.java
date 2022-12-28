package refactoring.consolidate_duplicate.good;

public class Main_good {

    private double extraSalary;
    private int seniority;
    private int education;
    private int incidents;
    private boolean certification;

    double calculaExtraSalary() {
        double result = 0;
        if (isElegibleExtraSalary()) {  // ejecuta si es verdadero
            result = 500;
            sendMessage();

        } else {                       // ejecuta si es falso
            result = 0;

        }
        sendMessage();

        return result;

    }


    private void sendMessage() {
        // send email
        // connect smtp
        System.out.println("Seding message");

    }

    private boolean isElegibleExtraSalary() {

        /*
            Agrupar condiciones utilizando AND (&&) y OR (||)
         */

        boolean estudios = seniority < 1 || education < 1;
        boolean antiguedad = incidents > 10 && !certification;

        return estudios || antiguedad;

    }



}
