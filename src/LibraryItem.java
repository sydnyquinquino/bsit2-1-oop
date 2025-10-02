public abstract class LibraryItem {
    protected String itemId, title, author, borrowerName;
    protected boolean isCheckedOut = false;

    public LibraryItem(String itemId, String title, String author) {
        this.itemId = itemId;
        this.title = title;
        this.author = author;
    }
    public String getItemInfo() {
        return getItemType() + ": " + title + " by " + author;
    }
    public void checkOut(String borrowerName) {
        isCheckedOut = true;
        this.borrowerName = borrowerName;
    }
    public void checkIn() {
        isCheckedOut = false;
        this.borrowerName = null;
    }
    public abstract String getItemType();
    public abstract double calculateLateFee(int daysLate);
}

