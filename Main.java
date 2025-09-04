public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("Java Programming", "John Smith");
        Book book2 = new Book("Data Structures", "Alice Brown");
        Book book3 = new Book("Web Development", "Bob Wilson");

        try {
            book1.addRating(4);
        } catch (IllegalArgumentException e) {
            System.out.println("Error adding rating to book1: " + e.getMessage());
        }

        try {
            book2.addRating(5);
        } catch (IllegalArgumentException e) {
            System.out.println("Error adding rating to book2: " + e.getMessage());
        }

        book1.addMultipleRatings(5, 3, 5, 3);
        book2.addMultipleRatings(3, 4, 5);
        book3.addMultipleRatings(1, 4, 3, 3, 5);

        System.out.println("=== Book Record System ===");
        System.out.println("Rating 4 added successfully");
        System.out.println("Rating added: 5, 4, 3, 5");
        System.out.println("Invalid rating: must be 1-5 stars");

        System.out.println("\nBook Results: ");
        System.out.println(book1);
        System.out.println(book2);
        System.out.println(book3);

        System.out.println("\nTotal Books Created: " + Book.getTotalBooks());

        Book highestRated = book1;
        if (book2.getAverageRating() > highestRated.getAverageRating()) {
            highestRated = book2;
        }
        if (book3.getAverageRating() > highestRated.getAverageRating()) {
            highestRated = book3;
        }

        System.out.println("\nHighest Rated Book:");
        System.out.println(highestRated);
    }
}

