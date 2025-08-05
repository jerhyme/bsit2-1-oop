public class Main {
    static class Book {
        String title;
        String author;
        int pages;
        boolean isAvailable;

        Book(String title, String author, int pages) {
            this.title = title;
            this.author = author;
            this.pages = pages;
            this.isAvailable = true;
            System.out.println("A new book '" + title + "' by " + author + " has been added to the library!");
        }

        void displayInfo() {
            System.out.println("Title: " + title);
            System.out.println("Author: " + author);
            System.out.println("Pages: " + pages);
            System.out.println("Available: " + (isAvailable ? "Yes" : "No"));
            System.out.println();
        }

        void borrowBook() {
            if (isAvailable) {
                isAvailable = false;
                System.out.println("You borrowed '" + title + "'.");
            } else {
                System.out.println("'" + title + "' is not available.");
            }
        }

        void returnBook() {
            if (!isAvailable) {
                isAvailable = true;
                System.out.println("You returned '" + title + "'.");
            } else {
                System.out.println("'" + title + "' is already available.");
            }
        }
    }

    public static void main(String[] args) {
        Book book1 = new Book("Harry Potter", "J.K. Rowling", 500);
        Book book2 = new Book("Percy Jackson", "Rick Riordan", 400);
        Book book3 = new Book("Diary of a Wimpy Kid", "Jeff Kinney", 220);

        System.out.println();

        book1.displayInfo();
        book2.displayInfo();
        book3.displayInfo();

        book2.borrowBook();
        book2.displayInfo();

        book2.returnBook();
        book2.displayInfo();
    }
}