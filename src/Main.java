public class Main {
    public static void main(String[] args) {
        Manager manager = new Manager("Alice Smith", 2001, 80000, "Engineering", 15000, 8);
        System.out.println("\n--- Employee details ---");
        manager.displayInfo();
        manager.work();
        System.out.println("Monthly Salary: $" + manager.calculateSalary());

        Developer developer = new Developer("Bob Johnson", 2002, 70000, "Engineering", "Java", 5);
        System.out.println("\n--- Employee details ---");
        developer.displayInfo();
        developer.work();
        System.out.println("Monthly Salary: $" + developer.calculateSalary());

        Intern intern = new Intern("Charlie Brown", 2003, 30000, "Engineering", "Tech University", true);
        System.out.println("\n--- Employee details ---");
        intern.displayInfo();
        intern.work();
        System.out.println("Monthly Salary: $" + intern.calculateSalary());
    }
}