package ex_05_TypeCasting;

import java.util.Scanner;

public class Lab060_TypeCasting_Narrowing {

    public static void main(String[] args) {
 int val = 300;
 byte b = (byte)val;
        System.out.println(b);
//byte b = val; // Invalid - Narrowing - Implicit Casting is not allowed.
//        byte b = (byte)val; // Valid - Narrowing - Explicit Casting - Allowed.
//        // Data Loss.
    }
}
