import java.io.*;
import java.net.*;
import java.util.Scanner;

public class PublicServerClient {
    public static void main(String[] args) throws Exception {
        Socket socket = new Socket("localhost", 5000);
        DataInputStream dis = new DataInputStream(socket.getInputStream());
        DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        dos.writeUTF(name);
        Thread send = new Thread(() -> {
            try {
                while (true) {
                    String msg = sc.nextLine();
                    dos.writeUTF(msg);
                }
            } catch (Exception e) {}
        });
        Thread receive = new Thread(() -> {
            try {
                while (true) {
                    String msg = dis.readUTF();
                    System.out.println(msg);
                }
            } catch (Exception e) {}
        });
        send.start();
        receive.start();
    }
}
