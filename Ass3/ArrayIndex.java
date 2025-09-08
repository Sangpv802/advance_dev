package advance_dev.Ass3;

import java.util.Random;
import java.util.Scanner;

public class ArrayIndex
{
    public static void main(String[] args)
    {
        int[] numbers= new int[100];
        Random random = new Random();

        for (int i = 0; i < numbers.length; i++)
        {
            numbers[i] = random.nextInt(1000);
        }

        Scanner sc = new Scanner(System.in);
        System.out.print("enter indicies of array: ");
        int index = sc.nextInt();
        try
        {
            System.out.println("value at index " + index + " is " + numbers[index]);
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Index out of bounds. Please enter a valid index between 0 and " + (numbers.length - 1) + ".");
        }
    }
}