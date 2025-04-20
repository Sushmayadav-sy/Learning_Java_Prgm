package ex_06_Ternary_Operators;

import java.util.Scanner;

public class Lab066_EvenOdd {
    public static void main(String[] args) {
        // Find the number is even or odd

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to check Odd or even");

        int num = sc.nextInt();

        String check = num % 2== 0 ? "Even" : "Odd";
        System.out.println(check);
    }
}
