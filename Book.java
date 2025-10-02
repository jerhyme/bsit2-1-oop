
class Book extends LibraryItem implements Borrowable {
    private String isbn;
    private int numberOfPages;
    private String genre;


    public Book(String itemId, String title, String author, String isbn, int numberOfPages, String genre) {
        super(itemId, title, author);
        this.isbn = isbn;
        this.numberOfPages = numberOfPages;
        this.genre = genre;
    }


    // Getters
    public String getIsbn() {
        return isbn;
    }


    public int getNumberOfPages() {
        return numberOfPages;
    }


    public String getGenre() {
        return genre;
    }

