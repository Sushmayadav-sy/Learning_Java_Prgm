package ex_06_Ternary_Operators;

import java.util.Scanner;

public class Lab065_TO_maxNo {

    // Find max number between 2 numbers dont use if else

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 1st number");
        int num1 = sc.nextInt();
        System.out.println("Enter the 2nd number");
        int num2 = sc.nextInt();

        String max = num1 > num2 ? "Number 1 is max" : (num1==num2 ? "they are equal" : "Number 2 is max") ;
        System.out.println(max);

        System.out.println(Math.max(num1,num2));
    }
}
