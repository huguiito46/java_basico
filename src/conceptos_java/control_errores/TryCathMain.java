package conceptos_java.control_errores;

public class TryCathMain {
    public static void main(String[] args) {

        try{

            int result = 5 / 0;

        }catch (ArithmeticException e){

        }finally {
            System.out.println("Cierre de recursos");
        }

        System.out.println("Fin");
    }

}
