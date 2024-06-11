package Operators;
import java.util.*;
public class Unary {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number: ");
        int a = sc.nextInt();
        System.out.println("Enter Second Number: ");
        int b = sc.nextInt();
        System.out.println("a++ "+ (++a));
        System.out.println("b-- "+ (--b));
    }
}


