package ex_06_Ternary_Operators;

import java.util.Scanner;

public class Lab068_TO_RealAgeClassifier {
    public static void main(String[] args) {
        // age = 23 -> Adult  ( age > 18) , Minor (age  <18), Senior ( age > 65)
        // take an input from user

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the age of the person");
    byte age = sc.nextByte();
    String classifier = age > 65 ? "The person is Senior" : ((age> 18 ) ? "The person is Adult" :"The person is Minor");

        System.out.println(classifier);

    }

}
