import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Messenger extends Thread {
    Socket clientSocket;
    Messenger(Socket clientsocket) {
        this.clientSocket = clientsocket;
    }


    @Override
    public void run() {
        try {



            BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
            PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);

            String msg=null;
            do {
                msg = in.readLine();
                System.out.println("client sent message :" + msg);
                out.println("Server acknowledge this message :" + msg + "I'm in thread :" +currentThread().getName());

            }while (!msg.equals("exit"));

        }
        catch (IOException e){
            e.printStackTrace();
        }


    }


}
