
import java.io.*;
import java.net.*;
import java.util.Scanner;

public class FileClient {
    public static void main(String[] args) throws Exception {
        Socket s = new Socket("localhost", 5000);

        DataInputStream dis = new DataInputStream(s.getInputStream());
        DataOutputStream dos = new DataOutputStream(s.getOutputStream());
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter file name: ");
        String fileName = sc.nextLine();

        dos.writeUTF(fileName);

        String data;
        while (!(data = dis.readUTF()).equals("EOF")) {
            System.out.println(data);
        }

        s.close();
    }
}
