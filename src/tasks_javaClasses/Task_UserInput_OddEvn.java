package tasks_javaClasses;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Task_UserInput_OddEvn {
    public static void main(String[] args) {
        //Create a Program -
        // Take user input &
        // Check weather the input is even or odd number

        Scanner num = new Scanner(System.in);
        System.out.println("Please enter the number to check even or odd");
        int n = num.nextInt();

        if (n%2 == 0){
            System.out.println("Number is even");
        }
        else
            System.out.println("Number is odd");



    }


}
