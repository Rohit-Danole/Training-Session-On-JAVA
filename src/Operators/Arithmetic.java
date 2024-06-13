package Operators;
import java.util.*;
public class Arithmetic {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number: ");
        int a = sc.nextInt();
        System.out.println("Enter Second Number: ");
        int b = sc.nextInt();
        System.out.println("a + b = "+(a + b));
        System.out.println("a - b = "+(a - b));
        System.out.println("a / b = "+(a / b));
        System.out.println("a * b = "+(a * b));
        System.out.println("a % b = "+(a % b));
    }
}