import java.util.*;
class Person {		// Base class
    int age;
    String name;

    Person(String name, int age) {		    // Base class constructor
        this.name = name;
        this.age = age;
    }
		
    void display() {		   // Base class method
        System.out.println("Name : " + name);
        System.out.println("Age  : " + age);
    }
}

class Teacher extends Person {		// Derived class
    String subject;

    Teacher(String name, int age, String subject) {		    // Child class constructor using super()
        super(name, age);   // passing arguments to base class constructor
        this.subject = subject;
    }

    @Override		 // Method overriding
    void display() {
        super.display();    // overcoming function overriding
        System.out.println("Subject : " + subject);
    }
}	
class MPT {		// Main class
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter name: ");
        String name = s.nextLine();
        System.out.print("Enter age: ");
        int age = s.nextInt();
        s.nextLine(); // consume newline
        System.out.print("Enter subject: ");
        String subject = s.nextLine();
        Teacher t = new Teacher(name, age, subject);
        System.out.println("\n--- Teacher Details ---");
        t.display();t
        s.close();
    }
}
