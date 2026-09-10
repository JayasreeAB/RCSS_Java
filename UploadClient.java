import java.io.*;
import java.net.*;
import java.util.Scanner;

public class UploadClient {
    public static void main(String[] args) throws Exception {
        Socket s = new Socket("localhost", 5000);

        DataOutputStream dos = new DataOutputStream(s.getOutputStream());
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter content to upload (type EOF to finish):");

        String line;
        while (!(line = sc.nextLine()).equals("EOF")) {
            dos.writeUTF(line);
        }

        dos.writeUTF("EOF");

        s.close();
    }
}
