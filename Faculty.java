class Faculty implements LibraryManager {
    private String name;
    private String employeeId;

    public Faculty(String name, String employeeId) {
        this.name = name;
        this.employeeId = employeeId;
    }

    @Override
    public String getUserType() {
        return "Teacher";
    }

    @Override
    public int getMaxBorrowLimit() {
        return 5;
    }

    @Override
    public void borrowBorrowable(Barrowable barrowable) {
        if (barrowable.isAvailable()) {
            barrowable.borrowItem();
            System.out.println(name + " (" + getUserType() + ") borrowed: " + barrowable.getTitle());
        } else {
            System.out.println("Sorry, " + barrowable.getTitle() + " is not available");
        }
    }

    @Override
    public void returnBorrowable(Barrowable barrowable) {
        barrowable.returnItem();
    }
}