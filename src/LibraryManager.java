import java.util.ArrayList;
public class LibraryManager {
    private ArrayList<Borrowable> items = new ArrayList<>();
    public LibraryManager() {}
    public void addItem(Borrowable item) { items.add(item); }
    public void displayAllItems() {
        for (Borrowable item : items) {
            System.out.println(((LibraryItem)item).getItemInfo() + " (" + item.getBorrowingStatus() + ")");
        }
    }
    public void borrowItem(String itemId, String borrowerName) {
        for (Borrowable item : items) {
            LibraryItem li = (LibraryItem)item;
            if (li.itemId.equals(itemId) && item.isAvailable()) {
                item.borrowItem(borrowerName);
                System.out.println((borrowerName.contains("Dr.") ? "Faculty " : "Student ") + borrowerName + " borrowed: " + li.title);
                break;
            }
        }
    }
    public void returnItem(String itemId) {
        for (Borrowable item : items) {
            LibraryItem li = (LibraryItem)item;
            if (li.itemId.equals(itemId) && !item.isAvailable()) {
                item.returnItem();
                break;
            }
        }
    }
    public void displayAvailableItems() {
        for (Borrowable item : items) {
            if (item.isAvailable()) {
                LibraryItem li = (LibraryItem)item;
                System.out.println(li.getItemType() + ": " + li.title + " (" + item.getBorrowingStatus() + ")");
            }
        }
    }
    public void calculateTotalLateFees(int daysLate) {
        for (Borrowable item : items) {
            LibraryItem li = (LibraryItem)item;
            double fee = li.calculateLateFee(daysLate);
            System.out.println(li.title + " - " + daysLate + " days late: $" + String.format("%.2f", fee));
        }
    }
}
