import java.util.Scanner;

class CString {
    private String str;   

    public void read() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        str = sc.nextLine();
    }

    public void display() {
        System.out.println("String: " + str);
    }

    public boolean compare(CString obj) {
        return this.str.equals(obj.str);
    }

    public void add(CString obj) {
        this.str = this.str + obj.str;
    }

    public CString concatenate(CString obj) {
        CString temp = new CString();   
        temp.str = this.str + obj.str;  
        return temp;                    
    }
}

public class Cstring_add_nd_concatenate {
    public static void main(String[] args) {
        CString s1 = new CString();
        CString s2 = new CString();
        s1.read();
        s2.read();
        System.out.println("\n--- Displaying Strings ---");
        s1.display();
        s2.display();
        System.out.println("\nAre strings equal? " + s1.compare(s2));
        System.out.println("\nConcatenating s1 + s2 (new object):");
        CString s3 = s1.concatenate(s2);
        s3.display();

        System.out.println("\nAdding s2 to s1 (modifying s1):");
        s1.add(s2);
        s1.display();
    }
}