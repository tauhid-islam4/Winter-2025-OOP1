// BorrowableBook class
class BorrowableBook extends FictionBook {
    private boolean isBorrowed;

    public BorrowableBook(String title, String author, String isbn, int yearPublished, String genre) {
        super(title, author, isbn, yearPublished, genre);
        this.isBorrowed = false;
    }

    public void borrow() {
        if (!isBorrowed) {
            isBorrowed = true;
            System.out.println(title + " has been borrowed.");
        } else {
            System.out.println(title + " is already borrowed.");
        }
    }

    public void returnBook() {
        if (isBorrowed) {
            isBorrowed = false;
            System.out.println(title + " has been returned.");
        }
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Borrowed: " + (isBorrowed ? "Yes" : "No"));
    }
}