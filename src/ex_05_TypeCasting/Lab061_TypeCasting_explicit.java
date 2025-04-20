package ex_05_TypeCasting;

public class Lab061_TypeCasting_explicit {
    public static void main(String[] args) {
        long ph_no = 9036202236l;
//short s = phone_no; // implicit ? explicit
        short s = (short) ph_no; // Explicit Casting - Narrowing

        System.out.println(s);

    }
}
