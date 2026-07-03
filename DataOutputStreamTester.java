import java.io.DataOutputStream;
import java.io.FileOutputStream;

public class DataOutputStreamTester {
    public static void main(String[] args) {

        try {
            DataOutputStream dos =
                new DataOutputStream(new FileOutputStream("data.dat"));
    
            dos.writeInt(101);
            dos.writeDouble(99.5);
            dos.writeBoolean(true);
            dos.writeUTF("Java");
    
            dos.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
