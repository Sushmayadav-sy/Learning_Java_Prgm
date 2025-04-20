package tasks_javaClasses.tasks_21st_Mar;

import java.util.Scanner;

public class Task_Mar_21st_VowelsInString {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the word to check vowels and consonants");
        String name = scanner.nextLine();

        int vowelCount = 0;
        String vowels = "AEIOUaeiou";
        for (int i = 0; i < name.length(); i++) {
            char ch = name.charAt(i);
            if (vowels.indexOf(ch) != -1) {
                vowelCount++;
            }
        }
        System.out.println("Total number of vowels: " + vowelCount);


    }
}
