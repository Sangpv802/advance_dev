package advance_dev.Ass4;
import java.io.*;

public class WriteAndReadDoubleBinary {
    public static void main(String[] args) {
        try {
            File file = new File("advance_dev/Ass4/C.dat");
            DataOutputStream dos = new DataOutputStream(new FileOutputStream(file)); // write overlap

            // write 100 double numbers
            for (int i = 0; i < 100; i++) {
                double num = Math.random() * 100.0;
                dos.writeDouble(num);
            }
            dos.close();

            // read again
            DataInputStream dis = new DataInputStream(new FileInputStream(file));
            double sum = 0;
            for (int i = 0; i < 100; i++) {
                sum += dis.readDouble();
            }
            dis.close();

            System.out.println("evarage of 100 double number: " + (sum / 100));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
