import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class server {
    public static void main(String[] args) throws IOException {
        ServerSocket socket = new ServerSocket(4000);
        System.out.println("waiting for client to connect with the server");
        Socket clientSocket = socket.accept();


    }
}
