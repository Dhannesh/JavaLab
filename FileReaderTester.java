import java.io.FileReader;

public class FileReaderTester {
    public static void main(String[] args) {
        FileReader fr;
        int i;
        try {
            fr = new FileReader("Test2.txt");
            while ((i = fr.read()) != -1)
                System.out.print((char) i);
            fr.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
