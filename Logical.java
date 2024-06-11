package Operators;

import java.util.*;
public class Logical {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter True or False for first variable");
        boolean c = sc.nextBoolean();
        System.out.println("Enter True or False for second variable");
        boolean d = sc.nextBoolean();
        System.out.println("c && d = " + (c && d));
        System.out.println("c || d = " + (c || d));
        System.out.println("!(c && d) = " + !(c && d));
        sc.close();
    }
}
