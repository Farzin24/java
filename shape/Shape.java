import java.util.Scanner;

class Shape {
    double area(double radius) {
        return Math.PI * radius * radius;
    }

    double area(double length, double width) {
        return length * width;
    }

    double area(double base, double height, boolean isTriangle) {
        return 0.5 * base * height;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Shape shape = new Shape();

        System.out.print("Enter radius of the circle: ");
        double radius = scanner.nextDouble();
        System.out.println("Area of Circle: " + shape.area(radius));

        System.out.print("Enter length of the rectangle: ");
        double length = scanner.nextDouble();
        System.out.print("Enter width of the rectangle: ");
        double width = scanner.nextDouble();
        System.out.println("Area of Rectangle: " + shape.area(length, width));

        System.out.print("Enter base of the triangle: ");
        double base = scanner.nextDouble();
        System.out.print("Enter height of the triangle: ");
        double height = scanner.nextDouble();
        System.out.println("Area of Triangle: " + shape.area(base, height, true));

        scanner.close();
    }
}


