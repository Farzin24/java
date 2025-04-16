import java.util.Scanner;

class Publisher {
    String publisherName;

    Publisher(String publisherName) {
        this.publisherName = publisherName;
    }
}

class Book extends Publisher {
    String title;
    String author;

    Book(String publisherName, String title, String author) {
        super(publisherName);
        this.title = title;
        this.author = author;
    }

    void display() {
        System.out.println("Title     : " + title);
        System.out.println("Author    : " + author);
        System.out.println("Publisher : " + publisherName);
    }
}

class Literature extends Book {
    Literature(String publisherName, String title, String author) {
        super(publisherName, title, author);
    }

    void displayLiterature() {
        System.out.println("\n--- Literature Book ---");
        display();
    }
}

class Fiction extends Book {
    Fiction(String publisherName, String title, String author) {
        super(publisherName, title, author);
    }

    void displayFiction() {
        System.out.println("\n--- Fiction Book ---");
        display();
    }
}

public class BookInfo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of books: ");
        int n = sc.nextInt();
        sc.nextLine();

        Book[] books = new Book[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details of Book " + (i + 1) + ":");
            System.out.print("Title: ");
            String title = sc.nextLine();

            System.out.print("Author: ");
            String author = sc.nextLine();

            System.out.print("Publisher: ");
            String publisher = sc.nextLine();

            System.out.print("Category (Literature/Fiction): ");
            String category = sc.nextLine();

            if (category.equalsIgnoreCase("Literature")) {
                books[i] = new Literature(publisher, title, author);
            } else if (category.equalsIgnoreCase("Fiction")) {
                books[i] = new Fiction(publisher, title, author);
            } else {
                System.out.println("Invalid category. Skipping entry.");
                i--;
            }
        }

        System.out.println("\n--- Displaying Book Details ---");
        for (Book b : books) {
            if (b instanceof Literature) {
                ((Literature) b).displayLiterature();
            } else if (b instanceof Fiction) {
                ((Fiction) b).displayFiction();
            }
        }

        sc.close();
    }
}

