import java.util.Scanner;
class Student {
    private int sno;
    private String sname;
    private String sprogram;
    public void readData() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Student Number: ");
        sno = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Student Name: ");
        sname = sc.nextLine();
        System.out.print("Enter Student Program: ");
        sprogram = sc.nextLine();
    }
    public void displayData() {
        System.out.println("Student Number: " + sno);
        System.out.println("Student Name: " + sname);
        System.out.println("Program: " + sprogram);
        System.out.println();
    }
    public boolean equals(Student other) {
        return this.sno == other.sno &&
               this.sname.equals(other.sname) &&
               this.sprogram.equals(other.sprogram);
    }
}
public class Studentcompare {
    public static void main(String[] args) {
        System.out.println("Enter details for Student 1:");
        Student s1 = new Student();
        s1.readData();
        System.out.println("\nEnter details for Student 2:");
        Student s2 = new Student();
        s2.readData();
        System.out.println("\nStudent 1 Details:");
        s1.displayData();
        System.out.println("Student 2 Details:");
        s2.displayData();
        if (s1.equals(s2)) {
            System.out.println("Both students are equal.");
        } else {
            System.out.println("Students are NOT equal.");
        }
    }
}