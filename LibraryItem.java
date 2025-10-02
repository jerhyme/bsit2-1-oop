abstract class LibraryItem {
    protected String itemId;
    protected String title;
    protected String author;
    protected boolean isCheckedOut;
    protected String borrowerName;


    public LibraryItem(String itemId, String title, String author) {
        this.itemId = itemId;
        this.title = title;
        this.author = author;
        this.isCheckedOut = false;
        this.borrowerName = null;
    }


    public String getItemInfo() {
        return "Item ID: " + itemId + "\nTitle: " + title + "\nAuthor: " + author +
                "\nBorrowed by: " + (borrowerName == null ? "N/A" : borrowerName) +
                "\nAvailability: " + (isCheckedOut ? "Not Available" : "Available");
    }


    public void checkOut(String borrowerName) {
        this.isCheckedOut = true;
        this.borrowerName = borrowerName;
    }


    public void checkIn() {
        this.isCheckedOut = false;
        this.borrowerName = null;
    }


    public abstract String getItemType();


    public abstract double calculateLateFee(int daysLate);


    public String getItemId() {
        return itemId;
    }


    public String getTitle() {
        return title;
    }
}

