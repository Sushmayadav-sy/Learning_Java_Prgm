package ex_07_Increment_Decrement_Op;

import java.util.Scanner;

public class Lab069_In_de_op {
    public static void main(String[] args) {
//Scanner sc= new Scanner(System.in);
//        System.out.println("Enter a String value with 5 char");
//        String age_string = sc.next();
//        age_string = args[0];
//        String a1 = args[1];
//        String a2 = args[2];
//        String a3 = args[3];
//        String a4 = args[4];
//        String a5 = args[5];
//        int a = Integer.parseInt(age_string);
//        System.out.println(a1);
//        System.out.println(a2);
//        System.out.println(a3);
//        System.out.println(a4);
//        System.out.println(a5);

        String age_string = args[0];
        String a1 = args[1];
        String a2 = args[2];
        String a3 = args[3];
        String a4 = args[4]; // java.lang.ArrayIndexOutOfBoundsException
        int age = Integer.parseInt(age_string);
        System.out.println(age);
        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);

    }
}
