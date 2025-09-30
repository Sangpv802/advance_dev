package advance_dev.Ass5.Ass5_3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Dictionary dict = new Dictionary();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n=== ENGLISH-VIETNAMESE DICTIONARY ===");
            System.out.println("1. Add word");
            System.out.println("2. Remove word");
            System.out.println("3. Add meaning");
            System.out.println("4. Remove meaning");
            System.out.println("5. Lookup word");
            System.out.println("6. Display dictionary");
            System.out.println("7. Exit");
            System.out.print("Choose: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter English word: ");
                    String en1 = sc.nextLine();
                    System.out.print("Enter Vietnamese meaning: ");
                    String vn1 = sc.nextLine();
                    dict.addWord(en1, vn1);
                    break;
                case 2:
                    System.out.print("Enter English word to remove: ");
                    String en2 = sc.nextLine();
                    dict.removeWord(en2);
                    break;
                case 3:
                    System.out.print("Enter English word: ");
                    String en3 = sc.nextLine();
                    System.out.print("Enter new meaning: ");
                    String vn3 = sc.nextLine();
                    dict.addMeaning(en3, vn3);
                    break;
                case 4:
                    System.out.print("Enter English word: ");
                    String en4 = sc.nextLine();
                    System.out.print("Enter meaning to remove: ");
                    String vn4 = sc.nextLine();
                    dict.removeMeaning(en4, vn4);
                    break;
                case 5:
                    System.out.print("Enter English word: ");
                    String en5 = sc.nextLine();
                    dict.lookup(en5);
                    break;
                case 6:
                    dict.displayAll();
                    break;
                case 7:
                    System.out.println("Goodbye!");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}
