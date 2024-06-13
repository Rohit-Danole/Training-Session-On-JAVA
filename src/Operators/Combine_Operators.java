package Operators;
import java.util.Scanner;

public class Combine_Operators {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number: ");
        int a = sc.nextInt();
        System.out.println("Enter Second Number: ");
        int b = sc.nextInt();

        System.out.println("Unary Operators");
        System.out.println("a++ " + (++a));
        System.out.println("b-- " + (--b));

        System.out.println("Relational Operator");
        System.out.println("a == b: " + (a == b));
        System.out.println("a != b: " + (a != b));
        System.out.println("a > b: " + (a > b));
        System.out.println("a < b: " + (a < b));
        System.out.println("a >= b: " + (b >= a));
        System.out.println("a<=b: " + (b <= a));

        System.out.println("Arithmetic Operators");
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a / b = " + (a / b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a % b = " + (a % b));

        System.out.println("Logical Operators");
        System.out.println("Enter True or False for first variable");
        boolean c = sc.nextBoolean();
        System.out.println("Enter True or False for second variable");
        boolean d = sc.nextBoolean();
        System.out.println("c && d = " + (c && d));
        System.out.println("c || d = " + (c || d));
        System.out.println("!(c && d) = " + !(c && d));
    }
}
