import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class client {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("localhost", 4002);
        System.out.println("connected with server");
        // bufferReader is used to give input by the client to server
        BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        PrintWriter out = new PrintWriter(socket.getOutputStream(), true);

        Scanner sc = new Scanner(System.in);
        String message;
        do {
            System.out.println("enter the message you want to send to the server : ");
            message = sc.nextLine();
            out.println(message);
            String response = in.readLine();
            System.out.println(response);
        }while (!message.equals("exits"));


    }
}