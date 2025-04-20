package ex_06_Ternary_Operators;

import java.util.Scanner;

public class Lab064_TO_Syntax {
    public static void main(String[] args) {
        // result = condition ? expression1 : expression2;
 Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the number");
        int num = sc.nextInt();

        String number = num > 0 ? "number is positive" : (num==0 ? "number is zero" : "Number is negative");
        System.out.println(number);

    }
}
