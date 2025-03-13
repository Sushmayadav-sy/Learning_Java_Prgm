package SelfPractice_Java;

public class SP05_AbsVal_UnaryOperator {
//    Find the Absolute Value of a Number Using Unary Operators
//num = -20

    public static void main(String[] args) {

        int num = -50;

        num = (num < 0) ? - num : num ;

        System.out.println("Absolute Value "+ num);
    }

}
