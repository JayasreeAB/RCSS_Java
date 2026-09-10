import java.io.*;
import java.net.*;

public class UploadServer {
    public static void main(String[] args) throws Exception {
        ServerSocket ss = new ServerSocket(5000);
        Socket s = ss.accept();

        DataInputStream dis = new DataInputStream(s.getInputStream());
        BufferedWriter bw = new BufferedWriter(new FileWriter("server_file.txt"));

        String data;
        while (!(data = dis.readUTF()).equals("EOF")) {
            bw.write(data);
            bw.newLine();
        }

        bw.close();
        s.close();
        ss.close();
    }
}
