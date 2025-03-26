package ex_15_StringBuffer_Builder_StringFunctions;

public class Lab144_StringBuilder_Vs_Buffer {
    public static void main(String[] args) {

//        String - 90%
        String s0 = "Sushma";
        String s1 = new String("Sushma");

//        less than < 10% used
        StringBuffer stringBuffer = new StringBuffer("Sushma");
        StringBuilder stringBuilder = new StringBuilder("Sushma");

        System.out.println(s0);
        System.out.println(s1);
        System.out.println(stringBuffer);
        System.out.println(stringBuilder);

    }
}
