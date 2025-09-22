public class Book {
    private String title;
    private String author;
    private String isbn;
    private boolean isAvailable;
    private int yearPublished;

    public Book(String title, String author, String isbn, int yearPublished) {
        this.setTitle(title);
        this.setAuthor(author);
        this.setIsbn(isbn);
        this.setYearPublished(yearPublished);
        this.isAvailable = true;
    }

    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    public String getIsbn() { return isbn; }
    public boolean isAvailable() { return isAvailable; }
    public int getYearPublished() { return yearPublished; }

    public void setTitle(String title) {
        if (title == null || title.trim().isEmpty()) {
            throw new IllegalArgumentException("Invalid title. Title cannot be null or empty");
        }
        this.title = title;
    }

    public void setAuthor(String author) {
        if (author == null || author.trim().isEmpty()) {
            throw new IllegalArgumentException("Invalid author. Author cannot be null or empty");
        }
        this.author = author;
    }

    public void setIsbn(String isbn) {
        if (isbn == null || !(isbn.length() == 10 || isbn.length() == 13)) {
            throw new IllegalArgumentException("Invalid ISBN. ISBN must be 10 or 13 characters long");
        }
        this.isbn = isbn;
    }

    public void setYearPublished(int year) {
        if (year < 1450 || year > 2025) {
            throw new IllegalArgumentException("Invalid year provided. Year must be between 1450 and 2025");
        }
        this.yearPublished = year;
    }

    public void setAvailable(boolean available) {
        this.isAvailable = available;
    }

    public boolean borrowBook() {
        if (isAvailable) {
            isAvailable = false;
            return true;
        }
        return false;
    }

    public boolean returnBook() {
        if (!isAvailable) {
            isAvailable = true;
            return true;
        }
        return false;
    }

    public void displayBookInfo() {
        System.out.print("Title: " + title + " | Author: " + author + " | ISBN: " + isbn + " | Year: " + yearPublished + " | ");
        System.out.println("Status: " + (isAvailable ? "Available" : "Not available"));
    }
}

