import java.io.FileWriter;

public class FileWriterTester {
    public static void main(String[] args) {
        FileWriter fw;
        try {
            // fw = new FileWriter("file.txt");
            fw = new FileWriter("file.txt", true);
            String s = "public static void main(String[] args)";
            fw.write(s);
            fw.append("you can write anything");
            fw.write("this is last one");
            fw.close();
            System.out.println("file write completed");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
