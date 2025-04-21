package ex_14_Strings;

public class Lab135_String_Immutable {

    public static void main(String[] args) {
        String name = "Sushma";
        name.toUpperCase();
        System.out.println(name);

        // there are 2 values created in the string constant pool
        //1. promod -->> name
        //2. PROMOD --? by the upper case function
    }




}
