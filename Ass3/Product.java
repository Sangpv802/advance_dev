package advance_dev.Ass3;


import java.util.InputMismatchException;
import java.util.Scanner;

class InsufficientStockException extends Exception
{
    public InsufficientStockException(String message)
    {
        super(message);
    }

}
public class Product {
    private String productId;
    private String productName;
    private int quantity;
    private double price;

    public Product(String productId, String productName, int quantity, double price)
    {
        this.productId = productId;
        this.productName = productName;
        if (quantity < 0)
        {
            throw new IllegalArgumentException("Quantity cannot be negative.");
        }
        this.quantity = quantity;
        this.price = price;
    }

    public void addStock(int amount)
    {
        if (amount < 0)
        {
            throw new IllegalArgumentException("Amount to add cannot be negative.");
        }
        this.quantity += amount;
    }

    public void removeStock(int amount) throws InsufficientStockException
    {
        if (amount < 0)
        {
            throw new IllegalArgumentException("Amount to remove cannot be negative.");
        }
        if (amount > this.quantity)
        {
            throw new InsufficientStockException("Insufficient stock. Available quantity: " + this.quantity);
        }
        this.quantity -= amount;
    }

    public void display()
    {
        System.out.println("Product ID: " + productId);
        System.out.println("Product Name: " + productName);
        System.out.println("Quantity: " + quantity);
        System.out.println("Price: $" + price);
    }
}

