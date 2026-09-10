import java.io.*;
import java.net.*;
import java.util.Scanner;

public class ChatClientOne_one {
    public static void main(String[] args) throws Exception {

        Socket s = new Socket("localhost", 1234);

        Scanner sc = new Scanner(System.in);

        DataInputStream din = new DataInputStream(s.getInputStream());
        DataOutputStream dout = new DataOutputStream(s.getOutputStream());

        String msg1 = "", msg2 = "";

        while (!msg2.equals("bye")) {
            System.out.print("You: ");
            msg2 = sc.nextLine();
            dout.writeUTF(msg2);
            dout.flush();

            msg1 = din.readUTF();
            System.out.println("Server says: " + msg1);
        }

        din.close();
        dout.close();
        s.close();
    }
}