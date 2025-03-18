import java.util.Scanner;

class Complex {
    // Real and imaginary parts of the complex number
    double real, imaginary;

    // Constructor to initialize complex number
    Complex(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    // Method to add two complex numbers
    Complex add(Complex other) {
        double realSum = this.real + other.real;
        double imaginarySum = this.imaginary + other.imaginary;
        return new Complex(realSum, imaginarySum);
    }

    // Method to subtract two complex numbers
    Complex subtract(Complex other) {
        double realDiff = this.real - other.real;
        double imaginaryDiff = this.imaginary - other.imaginary;
        return new Complex(realDiff, imaginaryDiff);
    }

    // Method to multiply two complex numbers
    Complex multiply(Complex other) {
        double realProduct = this.real * other.real - this.imaginary * other.imaginary;
        double imaginaryProduct = this.real * other.imaginary + this.imaginary * other.real;
        return new Complex(realProduct, imaginaryProduct);
    }

    // Method to display the complex number
    void display() {
        if (imaginary >= 0)
            System.out.println(real + " + " + imaginary + "i");
        else
            System.out.println(real + " - " + (-imaginary) + "i");
    }
}

public class ComplexNumberOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input for the first complex number
        System.out.println("Enter real part of first complex number:");
        double real1 = scanner.nextDouble();
        System.out.println("Enter imaginary part of first complex number:");
        double imaginary1 = scanner.nextDouble();

        // Input for the second complex number
        System.out.println("Enter real part of second complex number:");
        double real2 = scanner.nextDouble();
        System.out.println("Enter imaginary part of second complex number:");
        double imaginary2 = scanner.nextDouble();

        // Create two complex numbers
        Complex c1 = new Complex(real1, imaginary1);
        Complex c2 = new Complex(real2, imaginary2);

        // Perform operations and display results
        Complex sum = c1.add(c2);
        System.out.print("Sum: ");
        sum.display();

        Complex difference = c1.subtract(c2);
        System.out.print("Difference: ");
        difference.display();

        Complex product = c1.multiply(c2);
        System.out.print("Product: ");
        product.display();

        scanner.close();
    }
}

