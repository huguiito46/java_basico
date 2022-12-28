package refactoring.consolidate_extract_method.bad;

public class Main {

    void printHTML(){

        printHead();
        printBody();
        System.out.println("This is the footer");
        System.out.println("Script");
        System.out.println("Copyright");
        System.out.println("");


    }

    private void printBody(){


    }

    private void printHead(){


    }



}
