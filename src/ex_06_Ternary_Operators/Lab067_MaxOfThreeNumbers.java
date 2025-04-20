package ex_06_Ternary_Operators;
import java.util.Scanner;

public class Lab067_MaxOfThreeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number 1");
        int n1 = sc.nextInt();
        System.out.println("Enter the number 2");
        int n2 = sc.nextInt();
        System.out.println("Enter the number 3");
        int n3 = sc.nextInt();

        String max = (n1>n2 && n1>n3) ? "N1 is greater" : ((n2>n3 && n2>n1) ? "N2 is greater" : "N3 is greater") ;
        System.out.println(max);
    }
}
