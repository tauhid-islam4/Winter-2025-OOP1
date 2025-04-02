import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class LibraryManagementSystem {
    private static LinkedList<Book> availableBooks = new LinkedList<>();
    private static Queue<String> borrowRequests = new LinkedList<>();
    private static Stack<String> returnHistory = new Stack<>();

    public static void main(String[] args) {
        // Creating books
        BorrowableBook book1 = new BorrowableBook("The Great Gatsby", "F. Scott Fitzgerald", "12345", 1925, "Classic");
        NonFictionBook book2 = new NonFictionBook("A Brief History of Time", "Stephen Hawking", "67890", 1988, "Science");
        ReferenceBook book3 = new ReferenceBook("Encyclopedia Britannica", "Various", "55555", 2000);

        // Adding books to available list
        availableBooks.add(book1);
        availableBooks.add(book2);
        availableBooks.add(book3);

        // Display available books
        System.out.println("Available Books:");
        for (Book book : availableBooks) {
            book.displayInfo();
            System.out.println();
        }

        // Processing Borrow Requests
        borrowRequests.add("The Great Gatsby");
        borrowRequests.add("Encyclopedia Britannica"); // Reference book should not be borrowed

        System.out.println("Processing Borrow Requests:");
        while (!borrowRequests.isEmpty()) {
            String requestedBook = borrowRequests.poll();
            borrowBook(requestedBook);
        }

        // Returning a book
        book1.returnBook();
        returnHistory.push(book1.title);

        // Display return history
        System.out.println("\nMost Recently Returned Book: " + returnHistory.peek());
    }

    private static void borrowBook(String title) {
        for (Book book : availableBooks) {
            if (book.title.equalsIgnoreCase(title)) {
                if (book instanceof ReferenceBook) {
                    System.out.println(title + " is a reference book and cannot be borrowed.");
                } else if (book instanceof BorrowableBook) {
                    ((BorrowableBook) book).borrow();
                }
                return;
            }
        }
        System.out.println("Book not found: " + title);
    }
}