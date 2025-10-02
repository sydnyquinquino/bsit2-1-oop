public class Book extends LibraryItem implements Borrowable {
    private String isbn, genre;
    private int numberOfPages;

    public Book(String itemId, String title, String author, String isbn, int numberOfPages, String genre) {
        super(itemId, title, author);
        this.isbn = isbn;
        setNumberOfPages(numberOfPages);
        setGenre(genre);
    }
    public String getIsbn() { return isbn; }
    public String getGenre() { return genre; }
    public int getNumberOfPages() { return numberOfPages; }
    public void setGenre(String genre) {
        if (genre != null && !genre.trim().isEmpty()) this.genre = genre;
    }
    public void setNumberOfPages(int pages) {
        if (pages > 0) this.numberOfPages = pages;
    }
    @Override
    public String getItemType() { return "Book"; }
    @Override
    public double calculateLateFee(int daysLate) { return daysLate * 0.50; }
    @Override
    public void borrowItem(String borrowerName) { checkOut(borrowerName); }
    @Override
    public void returnItem() { checkIn(); }
    @Override
    public boolean isAvailable() { return !isCheckedOut; }
    @Override
    public int getBorrowingPeriod() { return 14; }
}
