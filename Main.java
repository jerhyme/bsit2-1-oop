public class Main {
    public static void main(String[] args) {
        Barrowable book1 = new Book("Java Fundamentals", "B001", "Robert Martin");
        Barrowable dvd1 = new DVD("OOP Concepts", "D001", "Tech Films");
        Barrowable mag1 = new Magazine("Programming Weekly", "M001", 15);

       User student = new Student("Alice Johnson", "S12345");
       User teacher = new Faculty("Dr. Smith", "T001");
       User librarian = new LibraryManager("Mary Brown", "L001");

        System.out.println("=== Library Management System Demo ===");
        System.out.println("\nAvailable Media:");
        displayMediaInfo(book1);
        displayMediaInfo(dvd1);
        displayMediaInfo(mag1);

        System.out.println("\n=== Borrowing Test ===");
        student.borrowMedia(book1);
        teacher.borrowMedia(dvd1);
        student.borrowMedia(book1); // Should fail - already borrowed

        System.out.println("\n=== Returning Test ===");
        student.returnMedia(book1);
        librarian.borrowMedia(book1);

        System.out.println("\n=== User Information ===");
        displayUserInfo(student);
        displayUserInfo(teacher);
        displayUserInfo(librarian);
    }

    public static void displayMediaInfo(Barrowable barrowable) {
        barrowable.displayInfo();
    }

    public static void displayUserInfo(User user) {
        System.out.println(user.getUserType() + " - Max borrow limit: " + user.getMaxBorrowLimit() + " items");
    }
}
interface User {
    String getUserType();
    void borrowMedia(Barrowable barrowable);
    void returnMedia(Barrowable barrowable);
    int getMaxBorrowLimit();
}