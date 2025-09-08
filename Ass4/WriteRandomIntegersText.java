package advance_dev.Ass4;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class WriteRandomIntegersText {
    public static void main(String[] args) {
        try {

            // String currentDir = System.getProperty("user.dir");
            // System.out.println("Current working directory: " + currentDir);
            // File file = new File("text1.txt");
            // File file = new File(currentDir + File.separator + "text.txt");
            File file = new File("advance_dev/Ass4/text.txt");
            boolean exists = file.exists();

            FileWriter writer = new FileWriter(file, true); // true = append
            Random rand = new Random();

            for (int i = 1; i <= 150; i++) {
                int num = rand.nextInt(101); // 0-100
                writer.write(num + " ");
                if (i % 10 == 0) writer.write("\n"); // each line is 10 numbers
            }

            writer.close();
            System.out.println(exists ? "write data to the end of text.file" : "create new text.txt file and write data");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
