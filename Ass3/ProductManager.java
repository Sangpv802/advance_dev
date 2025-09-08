package advance_dev.Ass3;

import advance_dev.Ass3.Product;
import advance_dev.Ass3.InsufficientStockException;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ProductManager {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        Product product = new Product("P001", "Laptop", 10, 999.99);

        while (true)
        {
            System.out.println("\n1. Display Product");
            System.out.println("2. Add Stock");
            System.out.println("3. Remove Stock");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");

            int choice;
            try
            {
                choice = scanner.nextInt();
            }
            catch (InputMismatchException e)
            {
                System.out.println("Invalid input. Please enter a number between 1 and 4.");
                scanner.next(); // Clear the invalid input
                continue;
            }

            switch (choice)
            {
                case 1:
                    product.display();
                    break;
                case 2:
                    System.out.print("Enter amount to add: ");
                    int addAmount = scanner.nextInt();
                    try
                    {
                        product.addStock(addAmount);
                        System.out.println("Stock added successfully.");
                    }
                    catch (IllegalArgumentException e)
                    {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 3:
                    System.out.print("Enter amount to remove: ");
                    int removeAmount = scanner.nextInt();
                    try
                    {
                        product.removeStock(removeAmount);
                        System.out.println("Stock removed successfully.");
                    }
                    catch (IllegalArgumentException | InsufficientStockException e)
                    {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 4:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please select a number between 1 and 4.");
            }
        }
    }
}
