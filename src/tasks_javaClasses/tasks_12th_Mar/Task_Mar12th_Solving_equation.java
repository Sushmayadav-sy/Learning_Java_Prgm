package tasks_javaClasses.tasks_12th_Mar;

public class Task_Mar12th_Solving_equation {

    //SOLVE THE EQUATION----->>  Cube root of (x square) + (y square) - |Z|
    public static void main(String[] args) {
        int x = 10;
        int y = 10;
        int z = 10;

       double a = Math.cbrt(Math.pow(x, 2) + Math.pow(y, 2) - Math.abs(z));
        System.out.printf("Result %f", a);
    }
    }
