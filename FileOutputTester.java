import java.io.BufferedOutputStream;
import java.io.FileOutputStream;

public class FileOutputTester {
    public static void main(String[] args) {
        FileOutputStream fout;
        BufferedOutputStream bout;
        try {
            fout = new FileOutputStream("Test2.txt");
            bout = new BufferedOutputStream(fout);
            byte b = 68;
            // fout.write(b);
            bout.write(b);
            b = 69;
            fout.write(b);
            byte[] varByte = { '\n', 97, 98, 99, 100 };
            fout.write(varByte);
            String data = "\nSome text content in the byte stream file.\n";
            fout.write(data.getBytes());
            fout.close();
            System.out.println("File written successfully");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
