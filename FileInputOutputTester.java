import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileInputOutputTester {
    public static void main(String[] args) {
        FileInputStream fin;
        FileOutputStream fout;
        int i;
        try {
            fin = new FileInputStream("image.jpg");
            fout = new FileOutputStream("image_copy.jpg");
            System.out.println("Total Bytes: " + fin.available());
            while ((i = fin.read()) != -1)
                fout.write(i);
            fin.close();
            fout.close();
            System.out.println("File created successfully");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
