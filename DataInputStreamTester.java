import java.io.DataInputStream;
import java.io.FileInputStream;

public class DataInputStreamTester {
    public static void main(String[] args) {
        try {
            DataInputStream dis = new DataInputStream(new FileInputStream("data.dat"));

            int id = dis.readInt();
            double marks = dis.readDouble();
            boolean status = dis.readBoolean();
            String name = dis.readUTF();

            System.out.println(id);
            System.out.println(marks);
            System.out.println(status);
            System.out.println(name);

            dis.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
