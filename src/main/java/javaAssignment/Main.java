package javaAssignment;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Create an object of the 'methods' class once before the loop starts
        Methods MyFunc = new Methods();
        int choice;

        do {
            // 1. Display the menu
            System.out.println("\n--- Number Analyzer Menu ---");
            System.out.println("1. Check Number Type (Positive/Negative/Zero)");
            System.out.println("2. Calculate Sum of Two Numbers");
            System.out.println("3. Check Even or Odd");
            System.out.println("4. Print Numbers Descending (10 to 1)");
            System.out.println("5. Exit");
            System.out.print("Please enter your choice: ");

            // Read the user's choice
            choice = sc.nextInt();

            // 2. Execute the required action based on the user's choice
            if (choice == 1) {
                System.out.println("Enter a number:");
                int num = sc.nextInt(); // Get the number from the user
                String result = MyFunc.checkNumberType(num);
                System.out.println(result);
            }
            else if (choice == 2) {
                System.out.println("Enter two numbers:");
                int num1 = sc.nextInt();
                int num2 = sc.nextInt();
                int sum = MyFunc.calculateSum(num1, num2);
                System.out.println("output " + sum);
            }
            else if (choice == 3) {
                // Calling the method to check if the number is even or odd
                System.out.println("Enter a number:");
                int num = sc.nextInt();
                MyFunc.printEvenOrOdd(num);


            }
            else if (choice == 4) {
                System.out.println("Enter a number:");
                int num = sc.nextInt();
                MyFunc.printNumbersDescending(num);
            }
            else if (choice == 5) {
                // Terminate the program
                System.out.println("Thank you for using Number Analyzer.");
                System.exit(0);
            }
            else {
                // Validation: If the user enters a number not on the menu
                System.out.println("Invalid Choice");
            }

        } while (true); // The loop is infinite because we use System.exit(0) to break out of it
    }
}