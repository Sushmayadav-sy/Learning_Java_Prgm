package ex_14_Strings;

public class Lab145_SB {
    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer("Sushma");
        stringBuffer.append(" Yadav");
        System.out.println(stringBuffer);
        System.out.println(stringBuffer.reverse());

        String s1 = "Hello";
        String s2 = "World";
        String s3 = s1 + s2; // Creates a new string "Hello World!"
        System.out.println(s3);
        System.out.println(s1);

    }
}
