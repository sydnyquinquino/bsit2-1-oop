public class Main {
    public static void main(String[] args) {
        System.out.println("=== Library Management System ===\n");
        System.out.println("Adding books to library...");

        Library library = new Library();
        Book book1 = new Book("Java Programming", "John Smith", "1234567890", 2020);
        Book book2 = new Book("Data Structures", "Jane Doe", "9876543210", 2019);
        Book book3 = new Book("Web Development", "Mike Johnson", "5555666677", 2021);

        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);

        System.out.println();

        library.displayAllBooks();

        System.out.println("Borrowing Java Programming...");
        if (library.borrowBook("1234567890")) {
            System.out.println("Book borrowed successfully!");
        } else {
            System.out.println("Book is not available for borrowing.");
        }
        System.out.println();

        System.out.println("Trying to borrow Java Programming again...");
        if (library.borrowBook("1234567890")) {
            System.out.println("Book borrowed successfully!");
        } else {
            System.out.println("Book is not available for borrowing.");
        }
        System.out.println();

        library.displayAvailableBooks();

        System.out.println("Returning Java Programming...");
        if (library.returnBook("1234567890")) {
            System.out.println("Book returned successfully!");
        } else {
            System.out.println("Book was not borrowed.");
        }
        System.out.println();

        System.out.println("Testing validation...");
        try {
            Book invalid = new Book("Test Book", "Test Author", "123", 1400);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            if (e.getMessage().contains("year")) {
                System.out.println("Invalid year provided. Year must be between 1450 and 2025");
            }
            if (e.getMessage().contains("ISBN")) {
                System.out.println("Invalid ISBN. ISBN must be 10 or 13 characters long");
            }
        }
    }
}