package ex_05_TypeCasting;

public class Lab059_TypeCasting_Explicit {
    public static void main(String[] args) {
        int val = 300;
        //byte b1 = val - this is implicit and is not possible s yhe
        byte b1 = (byte)val;
//        Explicit narrowing this is which makes the output in 8 bit as byte has only 8 byte
        System.out.println(b1);
    }
}
