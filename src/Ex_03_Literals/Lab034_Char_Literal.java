package Ex_03_Literals;

public class Lab034_Char_Literal {
    public static void main(String[] args) {
 char c1 = 'B';
 char c2 = '@';
         char c3 = '-';
    char c4 = 'A';
    char c5 = '9';
    char c6 = '1';
    char c7 = '(';
    char c8 = ' '; //blank space

        //escape char
        char new_line = '\n';
        char tab = '\t';
        char back_space = '\b';
        char carriage_return = '\r';

        System.out.println("Sushma\n"+"Yadav");
        System.out.println("Sushma"+new_line+"Yadav"); //both gives the same o/p
        System.out.println("Sushma\t"+"Yadav");
        System.out.println("Sushma"+tab+"Yadav"); //both does the same
        System.out.println("Sushma\b"+"Yadav");
        System.out.println("Sushma"+back_space+"Yadav"); // remove one char from the place where \b is added
        System.out.println("Sushma\r"+ "test"+"Yadav"); // remove entire string that is present before \r is added
        System.out.println("Sushma"+carriage_return+"Yadav");

    }
}
