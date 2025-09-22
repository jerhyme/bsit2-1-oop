public class Library {
    private Book[] books;
    private int bookCount;

    public Library() {
        books = new Book[10];
        bookCount = 0;
    }

    public boolean addBook(Book book) {
        if (bookCount < books.length) {
            books[bookCount++] = book;
            System.out.println("Book added: " + book.getTitle() + " by " + book.getAuthor());
            return true;
        } else {
            System.out.println("Library is full. Cannot add more books.");
            return false;
        }
    }

    public boolean removeBook(String isbn) {
        for (int i = 0; i < bookCount; i++) {
            if (books[i].getIsbn().equals(isbn)) {
                System.out.println("Book removed: " + books[i].getTitle());
                books[i] = books[bookCount - 1];
                books[bookCount - 1] = null;
                bookCount--;
                return true;
            }
        }
        System.out.println("Book not found.");
        return false;
    }

    public Book findBook(String isbn) {
        for (int i = 0; i < bookCount; i++) {
            if (books[i].getIsbn().equals(isbn)) {
                return books[i];
            }
        }
        return null;
    }

    public void borrowBook(String isbn) {
        Book book = findBook(isbn);
        if (book != null) {
            book.borrowBook();
        } else {
            System.out.println("Book not found.");
        }
    }

    public void returnBook(String isbn) {
        Book book = findBook(isbn);
        if (book != null) {
            book.returnBook();
        } else {
            System.out.println("Book not found.");
        }
    }

    public void displayAvailableBooks() {
        System.out.println("\nAvailable books:");
        for (int i = 0; i < bookCount; i++) {
            if (books[i].isAvailable()) {
                books[i].displayBookInfo();
            }
        }
    }

    public void displayAllBooks() {
        System.out.println("\nAll books in library:");
        for (int i = 0; i < bookCount; i++) {
            books[i].displayBookInfo();
        }
    }

    public int getBookCount() {
        return bookCount;
    }
}
