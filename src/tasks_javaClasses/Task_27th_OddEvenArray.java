package tasks_javaClasses;

import java.util.Scanner;

public class Task_27th_OddEvenArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter size of array, followed by elements of array");
        int size = sc.nextInt();
        int[] numbers = new int[size];

        for(int i =0; i< numbers.length;i++)
             numbers[i] = sc.nextInt();


        int Even_no = EvenNum (numbers);
        int Odd_no = OddNum(numbers);
        System.out.println(Even_no);
        System.out.println(Odd_no);
    }

    static int EvenNum(int[] numbers)
    {
        int even = numbers[0];
        for (int i = 0; i<numbers.length; i++)
        {
            if(even %2 ==0)
                even = numbers[i];
        }

        return even;
    }
    static int OddNum(int[] numbers)
    {
        int odd = numbers[0];
        for (int i = 0; i<numbers.length; i++)
        {
            if(odd %2 !=0)
                odd = numbers[i];
        }

        return odd;
    }

}
