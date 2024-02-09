package LAB9_08_01_24;

class Library {
    private Book[] books;
    private int capacity;
    private int count;

    Library(int capacity) {
        this.capacity = capacity;
        books = new Book[capacity];
        count = 0;
    }

    public void addBook(int bookId, String bookName, double bookPrice, String authorName) {
        for (int i = 0; i < count; i++) {
            if (books[i].bookId == bookId) {
                System.out.println("Cannot add the book with the same ID. Please choose a different ID.");
                return;
            }
        }
        
        if (count < capacity) {
            books[count++] = new Book(bookId, bookName, bookPrice, authorName);
        }
        else 
        {
            System.out.println("Library is full! Cannot add more books.");
        }
    }

    public void deleteBook(int bookId) {
        for (int i = 0; i < count; i++) {
            if (books[i].bookId == bookId) {
                for (int j = i; j < count - 1; j++) {
                    books[j] = books[j + 1];
                }
                count--;
                System.out.println("Book with ID " + bookId + " deleted successfully!");
                return;
            }
        }
        System.out.println("Book with ID " + bookId + " not found!");
    }

    public void displayBooks() {
        if (count == 0) {
            System.out.println("Library is empty!");
            return;
        }

        for (int i = 0; i < count; i++) {
            System.out.println(books[i]);
            System.out.println();
        }
    }

    public int getTotalBooks() {
        return count;
    }
}