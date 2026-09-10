import java.io.*;
import java.net.*;
public class Server {
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(5000);
            System.out.println("Server is waiting for client...");
            Socket socket = serverSocket.accept();
            System.out.println("Client connected!");
            DataInputStream dis = new DataInputStream(socket.getInputStream());
            DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
            String msg = "";
            while (!msg.equals("exit")) {
                msg = dis.readUTF();
                System.out.println("Client: " + msg);
                dos.writeUTF("Message received: " + msg);
                dos.flush();
            }
            dis.close();
            dos.close();
            socket.close();
            serverSocket.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
