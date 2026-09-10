import java.io.*;
import java.net.*;
import java.util.Scanner;

public class ChatServer0ne_one {
    public static void main(String[] args) throws Exception {

        ServerSocket ss = new ServerSocket(1234);
        System.out.println("Server started. Waiting for client...");

        Socket s = ss.accept();
        System.out.println("Client connected!");

        Scanner sc = new Scanner(System.in);

        DataInputStream din = new DataInputStream(s.getInputStream());
        DataOutputStream dout = new DataOutputStream(s.getOutputStream());

        String msg1 = "", msg2 = "";

        while (!msg1.equals("bye")) {
            msg1 = din.readUTF();
            System.out.println("Client says: " + msg1);

            System.out.print("You: ");
            msg2 = sc.nextLine();
            dout.writeUTF(msg2);
            dout.flush();
        }

        din.close();
        dout.close();
        s.close();
        ss.close();
    }
}