package advance_dev.Ass4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class SalarySummary {
    public static void main(String[] args) {
        double assistantTotal = 0;
        double teacherTotal = 0;
        double associateTotal = 0;

        try {
            Scanner sc = new Scanner(new File("advance_dev/Ass4/Salary.txt"));

            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                String[] parts = line.split("\\s+");
                String rank = parts[2];
                double salary = Double.parseDouble(parts[3]);

                switch(rank) {
                    case "assistant": assistantTotal += salary; break;
                    case "teacher": teacherTotal += salary; break;
                    case "associate": associateTotal += salary; break;
                }
            }

            sc.close();
            System.out.println("sum of salary assistant: " + assistantTotal);
            System.out.println("sum of salary teacher: " + teacherTotal);
            System.out.println("sum of salary associate: " + associateTotal);

        } catch (FileNotFoundException e) {
            System.out.println("File Salary.txt dont exit!");
        }
    }
}

