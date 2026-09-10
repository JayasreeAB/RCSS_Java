import java.util.Scanner;

class Complex {

    private int real;
    private int imag;

    // Read complex number
    void read() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter real part: ");
        real = sc.nextInt();
        System.out.print("Enter imaginary part: ");
        imag = sc.nextInt();
    }

    // Display complex number
    void display() {
        if (imag >= 0)
            System.out.println(real + " + " + imag + "i");
        else
            System.out.println(real + " - " + (-imag) + "i");
    }

    // Add two complex numbers
    Complex add(Complex c) {
        Complex temp = new Complex();
        temp.real = this.real + c.real;
        temp.imag = this.imag + c.imag;
        return temp;
    }

    // Multiply two complex numbers
    Complex multiply(Complex c) {
        Complex temp = new Complex();
        temp.real = (this.real * c.real) - (this.imag * c.imag);
        temp.imag = (this.real * c.imag) + (this.imag * c.real);
        return temp;
    }
}

public class ComplexDemo {
    public static void main(String[] args) {

        Complex c1 = new Complex();
        Complex c2 = new Complex();

        System.out.println("Enter first complex number:");
        c1.read();

        System.out.println("Enter second complex number:");
        c2.read();

        System.out.print("First: ");
        c1.display();

        System.out.print("Second: ");
        c2.display();

        Complex sum = c1.add(c2);
        Complex product = c1.multiply(c2);

        System.out.print("Sum: ");
        sum.display();

        System.out.print("Product: ");
        product.display();
    }
}
