package refactoring.consolidate_duplicate.bad;

public class Main_bad {
    private double extraSalary;
    private int seniority;
    private int education;
    private int incidents;
    private boolean certification;

    double calculaExtraSalary() {
        double result = 0;
        if (isElegibleExtraSalary()) {
            result = 500;
            sendMessage();

        } else {
            result = 0;
            sendMessage();

        }

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
