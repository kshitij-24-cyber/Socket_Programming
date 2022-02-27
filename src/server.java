import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class server {
    public static void main(String[] args) throws IOException {
        ServerSocket socket = new ServerSocket(4000);
        System.out.println("waiting for client to connect with the server");
        Socket clientSocket = socket.accept();
        System.out.println("client connected");

        BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
        PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);

        String msg;
        do {
             msg = in.readLine();
            System.out.println("client sent message" + msg);
            out.println("Server acknowledge this message :" + msg);
        }while (msg.equals("exit"));



    }
}
