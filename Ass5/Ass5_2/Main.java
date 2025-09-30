package advance_dev.Ass5.Ass5_2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        StoreQueueManager manager = new StoreQueueManager();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n=== STORE QUEUE MENU ===");
            System.out.println("1. Add customer");
            System.out.println("2. Process customer");
            System.out.println("3. Display queue");
            System.out.println("4. Exit");
            System.out.print("Choose: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter customer id: ");
                    String id = sc.nextLine();
                    System.out.print("Enter customer name: ");
                    String name = sc.nextLine();
                    manager.addCustomer(new Customer(id, name));
                    break;
                case 2:
                    manager.processCustomer();
                    break;
                case 3:
                    manager.displayQueue();
                    break;
                case 4:
                    System.out.println("Bye!");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}
