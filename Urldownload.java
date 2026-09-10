import java.net.*;
import java.io.*;
import java.util.*;

class Urldownload {
    public static void main(String args[]) throws Exception {

        int c;
        URL u = new URL("https://beej.us/guide/bgnet/pdf/bgnet_usl_c_2.pdf");

        URLConnection uc = u.openConnection();

        System.out.println("Date: " + new Date(uc.getDate()));
        System.out.println("Content Type: " + uc.getContentType());
        System.out.println("Expires: " + uc.getExpiration());
        System.out.println("Last Modified: " + new Date(uc.getLastModified()));

        int len = uc.getContentLength();
        System.out.println("Content-length: " + len);

        FileOutputStream fout = new FileOutputStream("test.pdf");

        if (len > 0) {
            System.out.println("===Downloading Content===");

            InputStream input = uc.getInputStream();

            while ((c = input.read()) != -1) {
                fout.write(c);
            }

            fout.close();
            input.close();
            System.out.println("File downloaded successfully as test.pdf");
        } else {
            System.out.println("No content available");
        }
    }
}