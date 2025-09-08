package advance_dev.Ass4;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class GenerateSalaryFile {
    public static void main(String[] args) {
        try {
            FileWriter fw = new FileWriter("advance_dev/Ass4/Salary.txt");
            Random rand = new Random();
            String[] ranks = {"assistant", "teacher", "associate"};

            for (int i = 1; i <= 1000; i++) {
                String firstName = "FirstName" + i;
                String lastName = "LastName" + i;
                String rank = ranks[rand.nextInt(3)];
                double salary = 0;

                switch(rank) {
                    case "assistant":
                        salary = 50000 + rand.nextDouble() * (80000-50000);
                        break;
                    case "teacher":
                        salary = 60000 + rand.nextDouble() * (110000-60000);
                        break;
                    case "associate":
                        salary = 75000 + rand.nextDouble() * (130000-75000);
                        break;
                }

                fw.write(firstName + " " + lastName + " " + rank + " " + String.format("%.2f", salary) + "\n");
            }
            fw.close();
            System.out.println("File Salary.txt đã được tạo.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

