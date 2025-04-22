import java.util.Scanner;

// Interface with method prototypes
interface Shape {
    void area();
    void perimeter();
}

// Circle class implementing Shape
class Circle implements Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    public void area() {
        double a = Math.PI * radius * radius;
        System.out.println("Area of Circle: " + a);
    }

    public void perimeter() {
        double p = 2 * Math.PI * radius;
        System.out.println("Perimeter of Circle: " + p);
    }
}

// Rectangle class implementing Shape
class Rectangle implements Shape {
    double length, breadth;

    Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public void area() {
        double a = length * breadth;
        System.out.println("Area of Rectangle: " + a);
    }

    public void perimeter() {
        double p = 2 * (length + breadth);
        System.out.println("Perimeter of Rectangle: " + p);
    }
}

// Main class with menu
public class ShapeDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Circle");
            System.out.println("2. Rectangle");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter radius of circle: ");
                    double radius = sc.nextDouble();
                    Shape circle = new Circle(radius);
                    circle.area();
                    circle.perimeter();
                    break;

                case 2:
                    System.out.print("Enter length of rectangle: ");
                    double length = sc.nextDouble();
                    System.out.print("Enter breadth of rectangle: ");
                    double breadth = sc.nextDouble();
                    Shape rectangle = new Rectangle(length, breadth);
                    rectangle.area();
                    rectangle.perimeter();
                    break;

                case 3:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice! Try again.");
            }
        } while (choice != 3);

        sc.close();
    }
}

