//package Hotel_Bill;
//import java.util.Scanner;
//public class Code1 {
//
//    public static void main(String[] args)
//    {
//        // TODO Auto-generated method stub
//        String choice;
//        Scanner sc = new Scanner(System.in);
//        do
//        {
//            System.out.println("menu            Price");
//            System.out.println("1. Pav Bhaji     50rs");
//            System.out.println("2. Misal         50rs");
//            System.out.println("3. Bhel          40rs");
//            System.out.println("Enter the Menu item (Pav Bhaji, Misal, Bhel):");
//            int menu = sc.nextInt();
//            int qty;
//            int price = 0,total = 0;
//            switch(menu) {
//                case 1:
//                    System.out.println("Enter the Quantity:");
//                    qty = sc.nextInt();
//                    price = qty * 50;
//                    total = total+price;
//                    break;
//                case 2:
//                    System.out.println("Enter the Quantity:");
//                    qty = sc.nextInt();
//                    price = qty * 50;
//                    total = total+price;
//                    break;
//                case 3:
//                    System.out.println("Enter the Quantity:");
//                    qty = sc.nextInt();
//                    price = qty * 40;
//                    total = total+price;
//                    break;
//                default:
//                    System.out.println("Invalid menu item.");
//                    break;
//            }
//            if(price > 0) {
//                System.out.println("Total Price: " + total + "rs");
//            }
//            System.out.println("Do you want to see the menu again? (yes/no)");
//            choice = sc.next();
//        } while(choice.equalsIgnoreCase("yes"));
//    }
//}



//package Hotel_Bill;
//import java.util.Scanner;
//
//public class Code1 {
//
//    public static void main(String[] args) {
//        String choice;
//        Scanner sc = new Scanner(System.in);
//        int total = 0;
//
//        do {
//            System.out.println("Menu            Price");
//            System.out.println("1. Pav Bhaji     50rs");
//            System.out.println("2. Misal         50rs");
//            System.out.println("3. Bhel          40rs");
//            System.out.println("Enter the Menu item number (1 for Pav Bhaji, 2 for Misal, 3 for Bhel):");
//            int menu = sc.nextInt();
//            int qty;
//            int price = 0;
//
//            switch(menu) {
//                case 1:
//                    System.out.println("Enter the Quantity:");
//                    qty = sc.nextInt();
//                    price = qty * 50;
//                    total += price;
//                    System.out.println(qty + " Pav Bhaji ordered. Total price for this item: " + price + "rs");
//                    break;
//                case 2:
//                    System.out.println("Enter the Quantity:");
//                    qty = sc.nextInt();
//                    price = qty * 50;
//                    total += price;
//                    System.out.println(qty + " Misal ordered. Total price for this item: " + price + "rs");
//                    break;
//                case 3:
//                    System.out.println("Enter the Quantity:");
//                    qty = sc.nextInt();
//                    price = qty * 40;
//                    total += price;
//                    System.out.println(qty + " Bhel ordered. Total price for this item: " + price + "rs");
//                    break;
//                default:
//                    System.out.println("Invalid menu item.");
//                    break;
//            }
//
//            System.out.println("Do you want to order another item? (yes/no)");
//            choice = sc.next();
//        } while(choice.equalsIgnoreCase("yes"));
//
//        System.out.println("****** BILL ******");
//
//
//        System.out.println("Final Total Price: " + total + "rs");
//        System.out.println("Thank you for your order!");
//
//        sc.close();
//    }
//}




package Hotel_Bill;
import java.util.ArrayList;
import java.util.Scanner;

public class Code1 {

    public static void main(String[] args) {
        String choice;
        Scanner sc = new Scanner(System.in);
        int total = 0;
        int count=0;
        ArrayList<String> billDetails = new ArrayList<>();

        do {
            System.out.println("Menu            Price");
            System.out.println("1. Pav Bhaji     50rs");
            System.out.println("2. Misal         50rs");
            System.out.println("3. Bhel          40rs");
            System.out.println("Enter the Menu item number (1 for Pav Bhaji, 2 for Misal, 3 for Bhel):");
            int menu = sc.nextInt();
            int qty;
            int price = 0;
            String itemName = "";

            switch(menu) {
                case 1:
                    System.out.println("Enter the Quantity:");
                    qty = sc.nextInt();
                    price = qty * 50;
                    itemName = "Pav Bhaji";
                    total += price;
                    billDetails.add(qty + "      " + itemName + " @ 50rs = " + price + "rs");
                    System.out.println(qty + " Pav Bhaji ordered. Total price for this item: " + price + "rs");
                    break;
                case 2:
                    System.out.println("Enter the Quantity:");
                    qty = sc.nextInt();
                    price = qty * 50;
                    itemName = "Misal";
                    total += price;
                    billDetails.add(qty + "      " + itemName + " @ 50rs = " + price + "rs");
                    System.out.println(qty + " Misal ordered. Total price for this item: " + price + "rs");
                    break;
                case 3:
                    System.out.println("Enter the Quantity:");
                    qty = sc.nextInt();
                    price = qty * 40;
                    itemName = "Bhel";
                    total += price;
                    billDetails.add(qty + "      " + itemName + " @ 40rs = " + price + "rs");
                    System.out.println(qty + " Bhel ordered. Total price for this item: " + price + "rs");
                    break;
                default:
                    System.out.println("Invalid menu item.");
                    break;
            }
            System.out.println("Do you want to order another item? (yes/no)");
            choice = sc.next();
        } while(choice.equalsIgnoreCase("yes"));

        System.out.println("\nFinal Bill:");
        System.out.println("Quantity   Item      Price");
        for (String item : billDetails) {
            System.out.println(item +" ");
        }
        System.out.println("Final Total Price: " + total + "rs");
        System.out.println("Thank you for your order!");

        sc.close();
    }
}
