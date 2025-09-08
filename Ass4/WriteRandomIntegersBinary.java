package advance_dev.Ass4;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Random;

public class WriteRandomIntegersBinary {
    public static void main(String[] args) {
        try {
            File file = new File("advance_dev/Ass4/B.dat");
            boolean exists = file.exists();

            DataOutputStream dos = new DataOutputStream(new FileOutputStream(file, true));
            Random rand = new Random();

            for (int i = 0; i < 150; i++) {
                dos.writeInt(rand.nextInt(101));
            }

            dos.close();
            System.out.println(exists ? "Ghi dữ liệu nhị phân vào cuối file B.dat" : "Tạo file B.dat và ghi dữ liệu");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
