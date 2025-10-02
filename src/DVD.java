public class DVD extends LibraryItem implements Borrowable {
    private int duration;
    private String rating, genre;

    public DVD(String itemId, String title, String author, int duration, String rating, String genre) {
        super(itemId, title, author);
        setDuration(duration);
        setRating(rating);
        this.genre = genre;
    }
    public int getDuration() { return duration; }
    public String getRating() { return rating; }
    public String getGenre() { return genre; }
    public void setDuration(int duration) { if (duration > 0) this.duration = duration; }
    public void setRating(String rating) {
        if ("GPGPG-13RNC-17".contains(rating)) this.rating = rating;
    }
    @Override
    public String getItemType() { return "DVD"; }
    @Override
    public double calculateLateFee(int daysLate) { return daysLate * 1.00; }
    @Override
    public void borrowItem(String borrowerName) { checkOut(borrowerName); }
    @Override
    public void returnItem() { checkIn(); }
    @Override
    public boolean isAvailable() { return !isCheckedOut; }
    @Override
    public int getBorrowingPeriod() { return 5; }
    @Override
    public String getBorrowingStatus() { return "DVD: " + Borrowable.super.getBorrowingStatus(); }
}
