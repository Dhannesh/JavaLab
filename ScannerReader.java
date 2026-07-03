import java.io.File;
import java.util.Scanner;

public class ScannerReader {
    public static void main(String[] args) {
        File file;
        try {
            file = new File("FileWriterTester.java");
            Scanner scan = new Scanner(file);
            while (scan.hasNext()) {
                System.out.println(scan.nextLine());
            }
            scan.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
