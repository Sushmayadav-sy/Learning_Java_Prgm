package ex_05_TypeCasting;

public class Lab062_TypeCasting_ExampleUsed {
    public static void main(String[] args) {
        // Calculating course fee with Type casting with narrowing and widening

        int course = 100;
        float gst = 18.45f;

        int total = course + (int)gst; // narrowing - explicit
        // int total3 = course + gst; // narrowing - implicit - data loss so error occurs if we want to run in the program
        System.out.println(total);

        float total1 = (float)course + gst; // Explicit - widening
        float total2 = course + gst; //Auto->> implicit - widening
        System.out.println(total1);
        System.out.println(total2);
    }
}
