class LibraryManager implements User {
    private String name;
    private String employeeId;

    public LibraryManager(String name, String employeeId) {
        this.name = name;
        this.employeeId = employeeId;
    }

    @Override
    public String getUserType() {
        return "Librarian";
    }

    @Override
    public int getMaxBorrowLimit() {
        return 10;
    }

    @Override
    public void borrowMedia(Barrowable barrowable) {
        if (barrowable.isAvailable()) {
            barrowable.borrowItem();
            System.out.println(name + " (" + getUserType() + ") borrowed: " + barrowable.getTitle());
        } else {
            System.out.println("Sorry, " + barrowable.getTitle() + " is not available");
        }
    }

    @Override
    public void returnBarrowable(Barrowable barrowable) {
        barrowable.returnItem();
    }
}