import java.util.*;

interface Shape {
    void area();
}

class Rectangle implements Shape {
    int l, b;

    Rectangle(int x, int y) {
        l = x;
        b = y;
    }

    public void area() {
        System.out.println("Area of Rectangle = " + (l * b));
    }
}


class Square implements Shape {
    int s;

    Square(int x) {
        s = x;
    }

    public void area() {
        System.out.println("Area of Square = " + (s * s));
    }
}

public class RuntimePolymorphism_q20 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Shape sh;   

        System.out.println("1. Rectangle");
        System.out.println("2. Square");
        System.out.print("Enter your choice: ");
        int ch = sc.nextInt();

        if (ch == 1) {
            System.out.print("Enter length: ");
            int l = sc.nextInt();
            System.out.print("Enter breadth: ");
            int b = sc.nextInt();
            sh = new Rectangle(l, b);   
        } else {
            System.out.print("Enter side: ");
            int s = sc.nextInt();
            sh = new Square(s);        
        }

        sh.area();           
    }
}
