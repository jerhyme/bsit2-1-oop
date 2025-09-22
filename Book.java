public class Book {
    private String title;
    private String author;
    private String isbn;
    private boolean isAvailable;
    private int yearPublished;

    public Book(String title, String author, String isbn, int yearPublished) {
        setTitle(title);
        setAuthor(author);
        setIsbn(isbn);
        setYearPublished(yearPublished);
        this.isAvailable = true; // default
    }

    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    public String getIsbn() { return isbn; }
    public boolean isAvailable() { return isAvailable; }
    public int getYearPublished() { return yearPublished; }

    public void setTitle(String title) {
        if (title == null || title.trim().isEmpty()) {
            System.out.println("Invalid title. Title cannot be empty.");
        } else {
            this.title = title;
        }
    }

    public void setAuthor(String author) {
        if (author == null || author.trim().isEmpty()) {
            System.out.println("Invalid author. Author cannot be empty.");
        } else {
            this.author = author;
        }
    }

    public void setIsbn(String isbn) {
        if (isbn.length() == 10 || isbn.length() == 13) {
            this.isbn = isbn;
        } else {
            System.out.println("Invalid ISBN. ISBN must be 10 or 13 characters long");
        }
    }

    public void setYearPublished(int year) {
        if (year >= 1450 && year <= 2025) {
            this.yearPublished = year;
        } else {
            System.out.println("Invalid year provided. Year must be between 1450 and 2025");
        }
    }

    public void setAvailable(boolean available) {
        this.isAvailable = available;
    }

    public boolean borrowBook() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println("Book borrowed successfully!");
            return true;
        } else {
            System.out.println("Book is not available for borrowing.");
            return false;
        }
    }

    public boolean returnBook() {
        if (!isAvailable) {
            isAvailable = true;
            System.out.println("Book returned successfully!");
            return true;
        } else {
            System.out.println("Book was not borrowed.");
            return false;
        }
    }

    public void displayBookInfo() {
        System.out.println("Title: " + title + " | Author: " + author +
                " | ISBN: " + isbn + " | Year: " + yearPublished +
                " | Status: " + (isAvailable ? "Available" : "Borrowed"));
    }
}
