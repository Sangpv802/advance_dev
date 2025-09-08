package advance_dev.Ass4;

import java.io.*;
import java.util.Date;

public class SaveReadMixedData {
    public static void main(String[] args) {
        try {
            File file = new File("advance_dev/Ass4/D.dat");
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file));

            int[] arr = {1,2,3,4,5};
            Date now = new Date();
            double value = 5.5;

            oos.writeObject(arr);
            oos.writeObject(now);
            oos.writeDouble(value);
            oos.close();

            // Đọc dữ liệu
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
            int[] arrRead = (int[]) ois.readObject();
            Date dateRead = (Date) ois.readObject();
            double valueRead = ois.readDouble();
            ois.close();

            System.out.println("Array int: ");
            for(int n : arrRead) System.out.print(n + " ");
            System.out.println("\nDate: " + dateRead);
            System.out.println("Double: " + valueRead);

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
