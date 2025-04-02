// Abstract base class
abstract class Book {
    protected String title;
    protected String author;
    protected String isbn;
    protected int yearPublished;

    public Book(String title, String author, String isbn, int yearPublished) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.yearPublished = yearPublished;
    }

    public abstract String getBookType();

    public void displayInfo() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("ISBN: " + isbn);
        System.out.println("Year Published: " + yearPublished);
    }
}
