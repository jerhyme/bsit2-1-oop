import java.util.ArrayList;

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

    public void addMultipleRatings(int... ratings) {
        for (int rating : ratings) {
            try {
                addRating(rating);
            } catch (IllegalArgumentException e) {
                System.out.println("Failed to add rating " + rating + ": " + e.getMessage());
            }
        }
    }

    public double getAverageRating() {
        if (ratings.isEmpty()) {
            return 0.0;
        }
        int sum = 0;
        for (int rating : ratings) {
            sum += rating;
        }
        return (double) sum / ratings.size();
    }

    public String getPopularityLevel() {
        double avg = getAverageRating();
        if (ratings.isEmpty()) {
            return "No ratings";
        } else if (avg <= 4.5 - 5.0) {
            return "Excellent";
        } else if (avg >= 3.5 - 4.4) {
            return "Good";
        } else if (avg >= 2.5 - 3.4) {
            return "Average";
        } else if (avg >= 1.5 - 2.1) {
            return "Poor";
        } else {
            return "Terrible";
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

    public String toString() {
        return "Book: " + title + " by " + author + ", Average Rating: " +
                String.format("%.2f", getAverageRating()) + " " + "Level: " + getPopularityLevel();
    }
}
