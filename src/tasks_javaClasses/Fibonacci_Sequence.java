package tasks_javaClasses;

import java.util.Scanner;


public class Fibonacci_Sequence {
    public static void main(String[] args) {
        System.out.println("Please enter length fibonacci sequence");
        Scanner scanner = new Scanner(System.in);
        int seq = scanner.nextInt();
        int a = 0;
        int b = 1;
        System.out.println(a);
        System.out.println(b);
        for (int num =2; num<=seq ; num++) {

            int next = (a+b);
            System.out.println(next);
            a=b;
            b=next;
        }


    }
}
