package refactoring.consolidate_extract_class.bad;

/*

Extraemos los datos de Address y los creamos en otra clase (Address)para no tener tantas variables

 */

import refactoring.consolidate_extract_class.good.Address;

public class Main_bad {

    private Long id;
    private String firsName;
    private Integer age;

    // address
    private Address address;


}
