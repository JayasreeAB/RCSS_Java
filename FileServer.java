
import java.io.*;
import java.net.*;

public class FileServer {
    public static void main(String[] args) throws Exception {
        ServerSocket ss = new ServerSocket(5000);
        Socket s = ss.accept();

        DataInputStream dis = new DataInputStream(s.getInputStream());
        DataOutputStream dos = new DataOutputStream(s.getOutputStream());

        String fileName = dis.readUTF();
        File file = new File(fileName);

        if (file.exists()) {
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line;
            while ((line = br.readLine()) != null) {
                dos.writeUTF(line);
            }
            dos.writeUTF("EOF");
            br.close();
        } else {
            dos.writeUTF("File not found");
        }

        ss.close();
        s.close();
    }
}
