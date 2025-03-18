package tasks_javaClasses;

public class Task_In_De_Operatorts {
    public static void main(String[] args) {
        int a = 10;
        System.out.println(++a + a++ + a++);
        System.out.println(a);
// Results ---> ++a -> 11 + 11 (->12) + 12(->13) = 34
//        a is 13
    }
}
