import java.io.IOException;
import java.net.Socket;

public class server {
    public static void main(String[] args) throws IOException {
//        Thread.sleep(1000L);
        Socket socket = new Socket("localhost", 4000);

        System.out.println("connected to  the server");

    }
}
