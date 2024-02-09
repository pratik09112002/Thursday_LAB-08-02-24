// Q3. write a program to create Book management system.using linked list


package LAB9_08_01_24;

import java.util.Scanner;

public class Book_Management_System {
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        Library library = new Library(20); // Increased capacity to accommodate more books
        library.addBook(1, "To Kill a Mockingbird", 15.99, "Harper Lee");
        library.addBook(2, "1984", 12.49, "George Orwell");
        library.addBook(3, "Pride and Prejudice", 10.99, "Jane Austen");
        library.addBook(4, "The Great Gatsby", 14.25, "F. Scott Fitzgerald");
        library.addBook(5, "Moby-Dick", 18.99, "Herman Melville");
        library.addBook(6, "War and Peace", 22.50, "Leo Tolstoy");
        library.addBook(7, "The Catcher in the Rye", 9.99, "J.D. Salinger");
        library.addBook(8, "The Hobbit", 11.75, "J.R.R. Tolkien");
        library.addBook(9, "Brave New World", 13.99, "Aldous Huxley");
        library.addBook(10, "The Grapes of Wrath", 16.99, "John Steinbeck");

        int choice;
        do 
        {
            System.out.println("\n--- Book Management System Menu ---");
            System.out.println("1. Add a book");
            System.out.println("2. Delete a book");
            System.out.println("3. Display all books");
            System.out.println("4. Total books in library");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) 
            {
                case 1:
                    System.out.print("Enter book ID: ");
                    int bookId = scanner.nextInt();
                    scanner.nextLine(); // consume newline
                    System.out.print("Enter book name: ");
                    String bookName = scanner.nextLine();
                    System.out.print("Enter book price: ");
                    double bookPrice = scanner.nextDouble();
                    scanner.nextLine(); // consume newline
                    System.out.print("Enter author name: ");
                    String authorName = scanner.nextLine();
                    library.addBook(bookId, bookName, bookPrice, authorName);
                    System.out.println("Book added successfully!");
                    break;
                case 2:
                    System.out.print("Enter the ID of the book you want to delete: ");
                    int bookIdToDelete = scanner.nextInt();
                    library.deleteBook(bookIdToDelete);
                    break;
                case 3:
                    System.out.println("Books in the library:");
                    library.displayBooks();
                    break;
                case 4:
                    System.out.println("Total books in the library: " + library.getTotalBooks());
                    break;
                case 5:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice! Please enter a valid option.");
            }
        } 
        while (choice != 5);

        scanner.close();
    }
}