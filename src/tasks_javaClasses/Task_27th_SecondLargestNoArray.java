package tasks_javaClasses;

import java.util.Scanner;

public class Task_27th_SecondLargestNoArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter the length of the Array");
        int size = sc.nextInt();

        int[] arraylength = new int[size];


        for (int i = 0; i < arraylength.length; i++) {
            System.out.println("Please enter the of elements in the array");
            arraylength[i] = sc.nextInt();
        }

//        for (int i = 0; i < arraylength.length; i++) {
//            System.out.println(arraylength[i]);
//        }

        int second_max = max(arraylength);
        System.out.println("Second max is " + second_max);


    }

    static int max(int[] arraylength)
    {
        int first = arraylength[0];
        int second = arraylength[0];

        for (int i = 0; i < arraylength.length; i++) {
            if (arraylength[i] > first)
            {
                second = first;
                first = arraylength[i];

            } else if (arraylength[i] > second && arraylength[i] != first)
            {
                second = arraylength[i];
            }

        }
        return second;



    }

}

