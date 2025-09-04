public class TestBook {
    public static void main(String[] args) {
        System.out.println("=== Book Record System ===\n");
        System.out.println("Adding books and ratings...");

        Book book1 = new Book("Java Programming", "John Smith");
        Book book2 = new Book("Data Structures", "Alice Brown");
        Book book3 = new Book("Web Development", "Bob Wilson");

        try {
            book1.addRating(4);
            System.out.println("Rating 4 added successfully");
        } catch (IllegalArgumentException ex) {
            System.out.println("Error: " + ex.getMessage());
        }

        book2.addMultipleRatings(5, 4, 3, 5);
        book3.addMultipleRatings(4, 3, 2, 6);

        System.out.println();
        System.out.println("Book Results:");
        System.out.println(book1.displayBook());
        System.out.println(book2.displayBook());
        System.out.println(book3.displayBook());

        System.out.println("\nTotal books created: " + Book.getTotalBooks());

        Book[] books = {book1, book2, book3};
        Book highest = books[0];
        for (Book b : books) {
            if (b.getAverageRating() > highest.getAverageRating()) {
                highest = b;
            }
        }

        System.out.println("Highest rated book: " + highest.getTitle() + " by " +
                highest.getAuthor() + " (" + String.format("%.2f", highest.getAverageRating()) + ")");
    }
}

