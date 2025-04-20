package ex_06_Ternary_Operators;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Lab063_TernaryOperator {
    public static void main(String[] args) {
  Scanner Scan = new Scanner(System.in);
        System.out.println("Please enter the age of the person");
  int age = Scan.nextInt();

        String CanIVote = age>=18 ? "Yes, you can vote" : "No you cannot vote";
        System.out.println(CanIVote);
    }
}
