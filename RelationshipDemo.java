// --- IS-A relationship setup ---
class Vehicle {
    void transport() {
        System.out.println("Vehicle transports people/goods.");
    }
}

// --- HAS-A relationship setup ---
class Engine {
    void ignite() {
        System.out.println("Engine ignites fuel.");
    }
}

// --- Main Class Combining Both ---
class Car extends Vehicle { // Car IS-A Vehicle (Inheritance)
    private Engine engine;   // Car HAS-A Engine (Composition)

    public Car() {
        this.engine = new Engine(); // Initialize the engine
    }

    public void operate() {
        System.out.print("Car operation: ");
        this.transport(); // Use inherited method
        this.engine.ignite(); // Use composed object's method
    }
}

// --- Execution Class ---
public class RelationshipDemo {
    public static void main(String[] args) {
        Car myCar = new Car();

        // Demonstrating IS-A: A Car can do what a Vehicle does
        myCar.transport(); 

        // Demonstrating HAS-A: A Car uses its internal Engine
        myCar.operate(); 
    }
}