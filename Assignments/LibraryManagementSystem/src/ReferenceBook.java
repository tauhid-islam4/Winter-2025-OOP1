// ReferenceBook class
class ReferenceBook extends Book {
    private boolean restricted;

    public ReferenceBook(String title, String author, String isbn, int yearPublished) {
        super(title, author, isbn, yearPublished);
        this.restricted = true;
    }

    @Override
    public String getBookType() {
        return "Reference";
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("This is a reference book and cannot be borrowed.");
    }
}