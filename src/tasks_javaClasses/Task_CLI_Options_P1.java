package tasks_javaClasses;

import java.sql.SQLOutput;

public class Task_CLI_Options_P1 {
    public static void main(String[] args) {
        String name= args[0];
        String age = args[1];
        String salary = args[2];
        System.out.println("name of the person is " +name);
        System.out.println("age of the " +name + " is " +age);
        System.out.println("salary of the " +name +" is "+salary);

    }
}
