package advance_dev.Ass3;
import java.util.InputMismatchException;
import java.util.Scanner;

public class SumTwoNumbers {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a = 0;
        int b = 0;
        boolean valid = false;
        while(!valid)
        {
            try
            {
                System.out.print("first integer: ");
                a = sc.nextInt();
                System.out.print("second integer: ");
                b = sc.nextInt();
                valid = true;
            } 
            catch (InputMismatchException e)
            {
                System.out.println("Error: please enter a suitable integer number");
                sc.nextLine();
            }
        }
        int sum = a + b;
        System.out.println("sum of 2 number is " + sum);


    }
}
