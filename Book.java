package LAB9_08_01_24;

class Book 
{
    int bookId;
    String bookName;
    double bookPrice;
    String authorName;
    boolean availability;

    Book(int bookId, String bookName, double bookPrice, String authorName) 
    {
        this.bookId = bookId;
        this.bookName = bookName;
        this.bookPrice = bookPrice;
        this.authorName = authorName;
        this.availability = true;
    }

    public String toString() 
    {
        return "Book ID: " + bookId + "\nBook Name: " + bookName + "\nAuthor: " + authorName +
                "\nPrice: Rs " + bookPrice + "\nAvailability: " + (availability ? "Available" : "Not Available");
    }
}
