public class Main {
    public static void main(String[] args) {
        String name;
        String Grades;
        int age;
        String course;
        double Grade1;
        double Grade2;
        double Grade3;

        Student student1 = new Student("Alice","85.0, 90.0, 88.0", 20 , "BSIT" ,85.5, 90.0, 88.8);
        Student student2 = new Student("Bob","92.0, 95.0, 89.0", 19,"BSCS",92.0, 95.0, 89.0);
        Student student3 = new Student("Charlie","65.0, 70.0, 68.0", 21, "BSIT",65.0, 70.0, 68.0);

        student1.displayGrade();
        student2.displayGrade();
        student3.displayGrade();

    }
}

class Student {
    String name;
    String Grades;
    int age;
    String course;
    double Grade1;
    double Grade2;
    double Grade3;

    Student(String name,String Grades,int age, String course, double Grade1, double Grade2, double Grade3) {
        this.name = name;
        this.Grades = Grades;
        this.age = age;
        this.course = course;
        this.Grade1 = Grade1;
        this.Grade2 = Grade2;
        this.Grade3 = Grade3;
    }

    double calculateAverage() {
        return (Grade1 + Grade2 + Grade3) / 3;
    }

    void displayGrade() {
        double Average = calculateAverage();
        System.out.println("Name: " + name  + ", " + "Age: " + age + ", " +"Course " + course);
        System.out.println("Grades: " + Grades);
        System.out.println("Average: " + Average);

        if (Average >= 90) {
            System.out.println("Letter Grade: A");
            System.out.println("Status: PASSING");

        } else if (Average >= 80) {
            System.out.println("Letter Grade: B");
            System.out.println("Status: PASSING");

        } else if (Average >= 70) {
            System.out.println("Letter Grade: C");
            System.out.println("Status: FAILING");

        } else if (Average >= 60) {
            System.out.println("Letter Grade: D");
            System.out.println("Status: FAILING");
        } else {
            System.out.println("Letter Grade: F (Failed)");
        }
    }
}