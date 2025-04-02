// FictionBook class
class FictionBook extends Book {
    private String genre;

    public FictionBook(String title, String author, String isbn, int yearPublished, String genre) {
        super(title, author, isbn, yearPublished);
        this.genre = genre;
    }

    @Override
    public String getBookType() {
        return "Fiction";
    }
}

