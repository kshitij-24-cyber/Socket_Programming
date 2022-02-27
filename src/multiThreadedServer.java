import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class multiThreadedServer {
    public static void main(String[] args) throws IOException {
      ServerSocket socket = new ServerSocket(4002);
        System.out.println("waiting for the user to join");
        while (true){
            Socket clientSocket =socket.accept();
            System.out.println("user connected");
            Messenger obj = new Messenger(clientSocket);
            obj.start();
        }
    }
}


