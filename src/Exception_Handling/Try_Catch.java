package Exception_Handling;

import java.util.Scanner;

public class Try_Catch
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number");
        int x = sc.nextInt();
        System.out.println("Enter Second Number");
        int y = sc.nextInt();
        try {
            int div = x/y;
        }catch (ArithmeticException e)
        {
            e.printStackTrace();
        }
        System.out.println("Hello!");
    }

}
