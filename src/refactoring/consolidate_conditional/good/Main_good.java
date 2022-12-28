package refactoring.consolidate_conditional.good;

public class Main_good {

    private double extraSalary;
    private int seniority;
    private int education;
    private int incidents;
    private boolean certification;

    double calculateExtraSalary() {

        double result = 0;

        if(!esCandidato()){
            return result;
        }
        // Calculamos el salario extra

        return result;

    }

    private boolean esCandidato() {

        /*
            Agrupar condiciones utilizando AND (&&) y OR (||)
         */

        boolean estudios = seniority <  1 || education < 1;
        boolean antiguedad = incidents > 10 && !certification;

        return estudios || antiguedad;

    }

}
