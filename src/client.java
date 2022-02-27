import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * What is socket programming in Java?
 * Socket programming in Java is used for communication between the applications that are running on different JRE.
 * It can be either connection-oriented or connectionless.
 * On the whole, a socket is a way to establish a connection between a client and a server
 */


class client {

    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(4000);
        System.out.println("wait for client to connect with the server :");
        //waiting to client to connect with  the server
        Socket clientSocket = serverSocket.accept();
        System.out.println("connecntion with client sucessfull ");
    }
}