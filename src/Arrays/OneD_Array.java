package Arrays;

import java.util.Scanner;

public class OneD_Array
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int[] array = new int[100];
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();
        System.out.println("Enter " + n +" elements of the array");
        for (int i = 0;i < n;i++)
        {
            array[i] = sc.nextInt();

        }
        System.out.println("Elements of the array");
        for (int i = 0;i < n;i++)
        {
            System.out.print(array[i] + " ");
        }
    }
}
