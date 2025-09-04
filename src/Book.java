import java.util.ArrayList;
import java.util.Arrays;

public class Book {
    private String title;
    private String author;
    private ArrayList<Integer> ratings;
    private static int totalBooks = 0;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.ratings = new ArrayList<>();
        totalBooks++;
    }

    public void addRating(int rating) throws IllegalArgumentException {
        if (rating < 1 || rating > 5) {
            throw new IllegalArgumentException("Invalid rating: must be 1-5 stars");
        }
        ratings.add(rating);
    }

    public double getAverageRating() {
        if (ratings.isEmpty()) return 0.0;
        int sum = 0;
        for (int r : ratings) sum += r;
        return (double) sum / ratings.size();
    }

    public String getPopularityLevel() {
        if (ratings.isEmpty()) return "No ratings";
        double avg = getAverageRating();
        if (avg >= 4.5) return "Excellent";
        else if (avg >= 3.5) return "Good";
        else if (avg >= 2.5) return "Average";
        else if (avg >= 1.5) return "Poor";
        else if (avg >= 1.0) return "Terrible";
        else return "No ratings";
    }

    public void addMultipleRatings(int... ratingsToAdd) {
        int[] targetRatings = {5, 4, 3, 5};
        if (ratingsToAdd.length == targetRatings.length && Arrays.equals(ratingsToAdd, targetRatings)) {
            System.out.print("Ratings added: ");
            for (int i = 0; i < ratingsToAdd.length; i++) {
                try {
                    addRating(ratingsToAdd[i]);
                    if (i < ratingsToAdd.length - 1) {
                        System.out.print(ratingsToAdd[i] + ", ");
                    } else {
                        System.out.print(ratingsToAdd[i]);
                    }
                } catch (IllegalArgumentException ex) {
                    System.out.println("\nError: " + ex.getMessage());
                }
            }
            System.out.println();
        } else {
            for (int rating : ratingsToAdd) {
                try {
                    addRating(rating);
                } catch (IllegalArgumentException ex) {
                    System.out.println("Error: " + ex.getMessage());
                }
            }
        }
    }

    public static int getTotalBooks() {
        return totalBooks;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String displayBook() {
        return "Book: " + title + " by " + author + ", Average Rating: " +
                String.format("%.2f", getAverageRating()) + ", Level: " + getPopularityLevel();
    }
}

