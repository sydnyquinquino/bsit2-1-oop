import java.util.ArrayList;
public abstract class User {
    private String userId, name, email;
    private ArrayList<LibraryItem> borrowedItems = new ArrayList<>();

    public User(String userId, String name, String email) {
        this.userId = userId; this.name = name; this.email = email;
    }
    public String getUserId() { return userId; }
    public String getName() { return name; }
    public String getEmail() { return email; }
    public int getBorrowedItemsCount() { return borrowedItems.size(); }
    public void addBorrowedItem(LibraryItem item) { borrowedItems.add(item); }
    public void removeBorrowedItem(LibraryItem item) { borrowedItems.remove(item); }
    public void displayBorrowedItems() {
        for (LibraryItem item: borrowedItems) {
            System.out.println(item.getItemInfo());
        }
    }
    public abstract int getMaxBorrowLimit();
}
