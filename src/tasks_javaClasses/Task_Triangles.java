package tasks_javaClasses;

import java.util.Scanner;

public class Task_Triangles {

    public static void main(String[] args) {
        // ✅ Triangle Classifier:
        //
        // Write a program that classifies a triangle based on its side lengths.
        // Given three input values representing the lengths of the sides,
        // determine if the triangle is equilateral (all sides are equal),
        // isosceles (exactly two sides are equal),
        // or scalene (no sides are equal).
        // Use an if-else statement to classify the triangle.

        Scanner sides = new Scanner(System.in);
        System.out.println("Please enter the length of side 1 of the triangle");
        int s1 = sides.nextInt();
        System.out.println("Please enter the length of side 2 of the triangle");
        int s2 = sides.nextInt();
        System.out.println("Please enter the length of side 3 of the triangle");
        int s3 = sides.nextInt();

        if (s1==s2 && s1==s3 && s2==s3)
        {
            System.out.println("The triangle is an equilateral triangle");
        }
        else if ( s1== s2 && s1!= s3 || s1 == s3 && s1 != s2 || s2==s3 && s2 != s1)
        {
            System.out.println("The triangle is an isosceles triangle");
        }
        else if (s1!= s2 && s1 != s3 && s2 != s3)
        {
            System.out.println("The triangle is an scalene triangle");
        }
    }
}




