class Student implements LibraryManager {
    private String name;
    private String studentId;

    public Student(String name, String studentId) {
        this.name = name;
        this.studentId = studentId;
    }

    @Override
    public String getUserType() {
        return "Student";
    }

    @Override
    public int getMaxBorrowLimit() {
        return 3;
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