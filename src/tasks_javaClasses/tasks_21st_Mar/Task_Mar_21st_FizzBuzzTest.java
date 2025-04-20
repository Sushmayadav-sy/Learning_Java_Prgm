package tasks_javaClasses.tasks_21st_Mar;

public class Task_Mar_21st_FizzBuzzTest {
    public static void main(String[] args) {
//        Write a program that prints numbers from 1 to 100.
//        However, for multiples of 3, print "Fizz" instead of the number,
//        and for multiples of 5, print "Buzz."
//        For numbers that are multiples of both 3 and 5, print "FizzBuzz."
         for(int num = 1; num<=100; num++)
         {
             if(num%3==0 && num% 5 ==0) {
                 System.out.println("FizzBuzz");
             }
             else if (num%3 == 0)
             {
                 System.out.println("Fizz");
             }
             else if(num %5 ==0)
             {
                 System.out.println("Buzz");
             }
             else System.out.println(num);
         }
    }
}
//1
//2
//Fizz
//4
//Buzz
//Fizz
//7
//8
//Fizz
//Buzz
//11
//Fizz
//13
//14
//FizzBuzz
//16
//17
//Fizz
//19
//Buzz
//Fizz
//22
//23
//Fizz
//Buzz
//26
//Fizz
//28
//29
//FizzBuzz
//31
//32
//Fizz
//34
//Buzz
//Fizz
//37
//38
//Fizz
//Buzz
//41
//Fizz
//43
//44
//FizzBuzz
//46
//47
//Fizz
//49
//Buzz
//Fizz
//52
//53
//Fizz
//Buzz
//56
//Fizz
//58
//59
//FizzBuzz
//61
//62
//Fizz
//64
//Buzz
//Fizz
//67
//68
//Fizz
//Buzz
//71
//Fizz
//73
//74
//FizzBuzz
//76
//77
//Fizz
//79
//Buzz
//Fizz
//82
//83
//Fizz
//Buzz
//86
//Fizz
//88
//89
//FizzBuzz
//91
//92
//Fizz
//94
//Buzz
//Fizz
//97
//98
//Fizz
//Buzz
//
//Process finished with exit code 0