// NonFictionBook class
class NonFictionBook extends Book {
    private String subject;

    public NonFictionBook(String title, String author, String isbn, int yearPublished, String subject) {
        super(title, author, isbn, yearPublished);
        this.subject = subject;
    }

    @Override
    public String getBookType() {
        return "Non-Fiction";
    }
}