public class Book {
    public String title;
    public String author;
    public int pages;
    public boolean isAvailable;

    public Book(String title, String author, int pages) {
        this.title = title;
        this.author = author;
        this.pages = pages;
        this.isAvailable = true;
        System.out.println("A new book '" + title + "' by " + author + " has been added to the library!");
    }

    public void displayInfo() {
        System.out.println("Book Details:");
        System.out.println(" Title: " + title);
        System.out.println(" Author: " + author);
        System.out.println(" Pages: " + pages);
        System.out.println(" Available: " + (isAvailable ? "Yes" : "No"));
    }
    public void borrowBook() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println("You borrowed '" + title + "'. Enjoy reading!");
        } else {
            System.out.println("'" + title + "' is currently not available.");
        }
    }
    public void returnBook() {
        isAvailable = true;
        System.out.println("You returned '" + title + "'. Thank you!");
    }

    public static void main(String[] args) {
        Book book1 = new Book("Hunger Games Sunrise on the Reaping", "Suzanne Collins", 310);
        Book book2 = new Book("Fourth Wing", "Rebecca Yarros", 281);
        Book book3 = new Book("The Seven Husbands of Evelyn Hugo", "Taylor Jenkins Reid", 328);

        System.out.println();

        book1.displayInfo();
        System.out.println();

        book1.borrowBook();
        book1.borrowBook();
        System.out.println();

        book1.returnBook();
        book1.borrowBook();
    }
}
