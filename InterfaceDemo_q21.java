import java.util.*;

interface IShape {
    void draw();
    void move();
}

class Circle implements IShape {
    public void draw() {
        System.out.println("Drawing a Circle");
    }

    public void move() {
        System.out.println("Moving the Circle");
    }
}

class Rectangle implements IShape {
    public void draw() {
        System.out.println("Drawing a Rectangle");
    }

    public void move() {
        System.out.println("Moving the Rectangle");
    }
}

public class InterfaceDemo_q21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        IShape shape;
        System.out.println("Choose Shape:");
        System.out.println("1. Circle");
        System.out.println("2. Rectangle");
        System.out.print("Enter your choice: ");

        int choice = sc.nextInt();

        if (choice == 1) {
            shape = new Circle();      
        } else if (choice == 2) {
            shape = new Rectangle();   
        } else {
            System.out.println("Invalid choice");
            sc.close();
            return;
        }

      
        shape.draw();
        shape.move();
    }
}
