package advance_dev.Ass4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CountTextFile {
    public static void main(String[] args)
    {
        try
        {
            File file = new File("/home/sang/Downloads/advance_dev/advance_dev/Ass4/text.txt");
            Scanner scanner = new Scanner(file);

            int charCount = 0;
            int wordCount = 0;
            int lineCount = 0;

            while(scanner.hasNextLine())
            {
                String line = scanner.nextLine();
                lineCount++;
                charCount += line.length();
                String[] words = line.split("\\s+");
                wordCount += words.length;
            }

            System.out.println("Number of characters: " + charCount);
            System.out.println("Number of words: " + wordCount);
            System.out.println("Number of lines: " + lineCount);
            scanner.close();
        } 
        catch (FileNotFoundException e)
        {
            System.out.println("File not found: " + e.getMessage());
        }
    }
}
