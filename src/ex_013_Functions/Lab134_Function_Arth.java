package ex_013_Functions;

import java.util.Scanner;

public class Lab134_Function_Arth {
    // Create a Function of Sub, Sum, Mul and Div
    // with parameter, a, b (take the parameter from the User)

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x =0;
        int y =0;

        System.out.println("Enter the value of a");
        if (sc.hasNextInt()) {
            x = sc.nextInt();
        } else {
            System.out.println("Enter integer only");
             System.exit(0);
        }
        System.out.println("Enter the value of b");
        if (sc.hasNextInt()) {
            y = sc.nextInt();
        } else {
            System.out.println("Enter integer only");
            System.exit(0);
        }


        int sub_val = Sub(x,y);
        int sum_val = Sum(x,y);
        int mul_val = Mul(x,y);
        int div_val = Div(x,y);
        int mod_val = Mod(x,y);

        System.out.println("difference is " + sub_val);
        System.out.println("Sum is " + sum_val);
        System.out.println("Mul is " + mul_val);
        System.out.println("Division is " + div_val);
        System.out.println("Mod " +mod_val);




    }


    static int Sub(int a, int b) {
        return (a-b);
    }
    static int Sum(int a, int b) {
        return (a+b);
    }
    static int Mul(int a, int b) {
        return (a*b);
    }
    static int Div(int a, int b) {
        if (b==0)
        {
            System.out.println("number cannot be divided by 0");
            System.exit(0);
        }
            return (a / b);

    }
    static int Mod(int a, int b) {
        return (a%b);
    }



}
