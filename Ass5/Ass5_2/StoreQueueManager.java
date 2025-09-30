package advance_dev.Ass5.Ass5_2;

import java.util.LinkedList;
import java.util.Queue;

public class StoreQueueManager {
    private Queue<Customer> queue = new LinkedList<>();

    public void addCustomer(Customer customer) {
        queue.add(customer);
        System.out.println("Added: " + customer);
    }

    public void processCustomer() {
        if (!queue.isEmpty()) {
            Customer c = queue.poll();
            System.out.println("Processing customer: " + c);
        } else {
            System.out.println("Queue is empty.");
        }
    }

    public void displayQueue() {
        if (queue.isEmpty()) {
            System.out.println("Queue is empty.");
        } else {
            System.out.println("Current queue:");
            for (Customer c : queue) {
                System.out.println(c);
            }
        }
    }
}
