import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
//        System.out.println("Curicity is the starting for greate Adventure");
        String answer;
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter The Quantity");
            int quantity = sc.nextInt();
            System.out.println("Enter The Price");
            double price = sc.nextFloat();
            double total = quantity * price;
            System.out.println("Total is " + total);
            System.out.println();
            System.out.println("Do you want to add another item? (Y/N)");
            answer = sc.next();
        }
        while (answer.equalsIgnoreCase("Y"));


    }
}