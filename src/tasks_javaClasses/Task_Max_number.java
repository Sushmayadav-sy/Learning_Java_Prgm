package tasks_javaClasses;

public class Task_Max_number {

//    Take a user input 2 numbers from the arguments and calculate the maximum in between with ternary operator.
    public static void main(String[] args) {
        String num1 = args[0];
        String num2 = args[1];
        int n1 = Integer.parseInt(num1);
        int n2 = Integer.parseInt(num2);

        String max = n1 > n2 ? "n1 is max" : "n2 is max";

        System.out.println(max);
//        String a1 = args[0];
//        int a = Integer.parseInt(a1);
//        System.out.println(a);


    }

}
