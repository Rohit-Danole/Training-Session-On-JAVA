package Calculator_Project;

import java.util.Scanner;

public class Calculator_Project {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String ans;
        do {
            System.out.print("Calculator");
            System.out.println("Enter 1 for Addition");
            System.out.println("Enter 2 for Subtraction");
            System.out.println("Enter 3 for Multiplication");
            System.out.println("Enter 4 for Division");
            System.out.println("Enter 5 for Modulus");
            System.out.println("Enter 6 for Even Numbers");
            System.out.println("Enter 7 for Odd Numbers");
            System.out.println("Enter 8 for Exit");
            System.out.println("Enter Your Choice");
            int choice = sc.nextInt();
            switch (choice)
            {
                case 1: {
                    System.out.println("Enter First Number");
                    int first = sc.nextInt();
                    System.out.println("Enter Second Number");
                    int second = sc.nextInt();
                    int Result = first + second;
                    System.out.println("Addition: " + Result);
                    break;
                }
                case 2: {
                    System.out.println("Enter First Number");
                    int first = sc.nextInt();
                    System.out.println("Enter Second Number");
                    int second = sc.nextInt();
                    int Result = first - second;
                    System.out.println("Subtraction: " + Result);
                    break;
                }
                case 3: {
                    System.out.println("Enter First Number");
                    int first = sc.nextInt();
                    System.out.println("Enter Second Number");
                    int second = sc.nextInt();
                    int Result = first * second;
                    System.out.println("Multiplication: " + Result);
                    break;
                }
                case 4: {
                    System.out.println("Enter First Number");
                    int first = sc.nextInt();
                    System.out.println("Enter Second Number");
                    int second = sc.nextInt();
                    if (first < second || second == 0) {
                        System.out.println("Invalid Operation");
                    }
                    int Result = first / second;
                    System.out.println("Division: " + Result);
                    break;
                }
                case 5: {
                    System.out.println("Enter First Number");
                    int first = sc.nextInt();
                    System.out.println("Enter Second Number");
                    int second = sc.nextInt();
                    if (first < second || second == 0) {
                        System.out.println("Invalid Operation");
                    }
                    int Result = first % second;
                    System.out.println("Modulus: " + Result);
                    break;
                }
                case 6: {
                    System.out.println("Enter The Starting Number ");
                    int start = sc.nextInt();
                    System.out.println("Enter The Ending Number ");
                    int end = sc.nextInt();
                    System.out.println("Even Numbers From " + start + " to " + end);
                    for (int i = start; i <= end; i++) {
                        if (i % 2 == 0) {
                            System.out.println(i);
                        }
                    }
                    break;
                }
                case 7: {
                    System.out.println("Enter Start Number");
                    int start = sc.nextInt();
                    System.out.println("Enter End Number");
                    int end = sc.nextInt();
                    System.out.println("Odd Numbers From " + start + " to " + end);
                    for (int i = start; i <= end; i++) {
                        if (i % 2 != 0) {
                            System.out.println(i);
                        }
                    }
                    break;
                }
                case 8: {
                    System.exit(0);
                    System.out.println("Program has ended.");
                    break;
                }
                default: {
                    System.out.println("Invalid Choice");
                    break;
                }
            }
            System.out.println("Do you want to Continue? (Yes/No)");
            ans = sc.next();
        }
        while (ans.equalsIgnoreCase("yes"));

        System.out.println("Program has ended.");

    }
}
