import java.util.Scanner;

class EmployeeBase {
    int empId;
    String name;
    double salary;
    String address;

    EmployeeBase(int empId, String name, double salary, String address) {
        this.empId = empId;
        this.name = name;
        this.salary = salary;
        this.address = address;
    }
}

class Teacher extends EmployeeBase {
    String department;
    String subject;

    Teacher(int empId, String name, double salary, String address, String department, String subject) {
        super(empId, name, salary, address);
        this.department = department;
        this.subject = subject;
    }

    void display() {
        System.out.println("EmpID      : " + empId);
        System.out.println("Name       : " + name);
        System.out.println("Salary     : " + salary);
        System.out.println("Address    : " + address);
        System.out.println("Department : " + department);
        System.out.println("Subject    : " + subject);
        System.out.println("----------------------------------");
    }
}

public class Employee {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of teachers: ");
        int n = sc.nextInt();
        sc.nextLine();

        Teacher[] teachers = new Teacher[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details of Teacher " + (i + 1) + ":");

            System.out.print("EmpID: ");
            int empId = sc.nextInt();
            sc.nextLine();

            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Salary: ");
            double salary = sc.nextDouble();
            sc.nextLine();

            System.out.print("Address: ");
            String address = sc.nextLine();

            System.out.print("Department: ");
            String department = sc.nextLine();

            System.out.print("Subject: ");
            String subject = sc.nextLine();

            teachers[i] = new Teacher(empId, name, salary, address, department, subject);
        }

        System.out.println("\n--- Teacher Details ---");
        for (Teacher t : teachers) {
            t.display();
        }

        sc.close();
    }
}

