import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class FileInputTester {
    public static void main(String[] args) {
        FileInputStream fin;
        BufferedInputStream bin;
        byte[] data = new byte[10];
        int i = 0;
        try {
            fin = new FileInputStream("tester.java");
            bin = new BufferedInputStream(fin);
            // System.out.println("Total Bytes: " + fin.available());
            System.out.println("Total Bytes: " + bin.available());
            // while ((i = fin.read(data)) != -1) {
            while ((i = bin.read(data)) != -1) {
                // fileIn.skip(1);
                // System.out.print(data);
                for (byte x : data)
                    System.out.print((char) x);
            }
            fin.close();
        }

        catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("End of main");
        }

    }
}