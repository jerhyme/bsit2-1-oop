import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("STUDENT INFORMATION");
        System.out.println("Enter Student ID: ");
        String studentId = input.nextLine();

        System.out.println("Enter first name: ");
        String firstName = input.nextLine();

        System.out.println("Enter last name: ");
        String lastName = input.nextLine();

        System.out.println("Enter course: ");
        String course = input.nextLine();

        System.out.println("Enter section: ");
        String section = input.nextLine();

        System.out.println("STUDENT INFORMATION");
        System.out.println("Student ID:" + studentId);
        System.out.println("Student name:" + firstName +" "+ lastName);
        System.out.println("Course:" + course);
        System.out.println("Section:" + section);

        System.out.println("Enter Midterm exam score: ");
        int midtermExam = input.nextInt();

        System.out.println("Enter Final exam score: ");
        int finalExam = input.nextInt();

        System.out.println("Enter Project score: ");
        int projectScore = input.nextInt();

        System.out.println("Enter Attendance percentage: ");
        int attendancePercentage = input.nextInt();

        int totalScore = midtermExam + finalExam + projectScore + attendancePercentage;
        double averageScore = (double) totalScore / 400 * 100;

        String remarks;
        if (averageScore < 75) {
            remarks = "FAILED";
        } else {
            remarks = "PASSED";
        }

        System.out.println("STUDENT SCORES");
        System.out.println("Midterm exam score: " + midtermExam);
        System.out.println("Final exam score: " + finalExam);
        System.out.println("Project score: " + projectScore);
        System.out.println("Attendance score: " + attendancePercentage);
        System.out.println("Average score: " + averageScore);
        System.out.println("Remarks: " + remarks);

        input.close();
    }
}
