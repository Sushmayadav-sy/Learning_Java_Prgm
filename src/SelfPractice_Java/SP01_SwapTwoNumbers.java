package SelfPractice_Java;

public class SP01_SwapTwoNumbers {
    public static void main(String[] args) {
//        Swap Two Numbers Without Using a Third Variable
//        Use arithmetic operators (+, -, *, /) to swap two numbers.
        int a = 5;
        int b = 20;
//   use a multiplier and divider instead of variable as the a and b values are defined
//        a = (a*4)/2;
//        b= (2*b)/4;

//        Generally swap can work this way

        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("Swapped values: a = " + a + ", b = " + b);
    }
}
