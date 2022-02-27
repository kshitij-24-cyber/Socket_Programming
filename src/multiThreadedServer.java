import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class multiThreadedServer {
    public static void main(String[] args) throws IOException {
        ServerSocket socket = new ServerSocket(4001);
        System.out.println("waiting for the user to join");
        while (true) {
            Socket userSocket = socket.accept();
            System.out.println("user connected");
            Messenger obj = new Messenger(userSocket);
            obj.start();
        }
    }
}


