package Exception_Handling;

import Method_Overiding.A;

import java.io.IOException;
import java.util.Scanner;

public class Throws_Keyword
{
    public static void main(String[] args) throws ArithmeticException
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number");
        int x = sc.nextInt();
        System.out.println("Enter Second Number");
        int y = sc.nextInt();
        System.out.println("Div"+(x/y));
    }
}
