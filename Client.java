// Client

import java.io.*;
import java.net.*;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("localhost", 5000);

            DataInputStream dis = new DataInputStream(socket.getInputStream());
            DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
            Scanner sc = new Scanner(System.in);

            String msg = "";

            while (!msg.equals("exit")) {
                System.out.print("Enter message: ");
                msg = sc.nextLine();

                dos.writeUTF(msg);
                dos.flush();

                String response = dis.readUTF();
                System.out.println("Server: " + response);
            }

            dis.close();
            dos.close();
            socket.close();
            sc.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

