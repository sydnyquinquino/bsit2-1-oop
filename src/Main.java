import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Student ID: ");
        String studentId = scanner.nextLine();

        System.out.print("Student First Name: ");
        String firstName = scanner.nextLine();

        System.out.print("Student Last Name: ");
        String lastName = scanner.nextLine();

        System.out.print("Student Course: ");
        String course = scanner.nextLine();

        System.out.print("Student Section: ");
        String section = scanner.nextLine();

        System.out.println("STUDENT INFORMATION");
        System.out.println("Student ID: " + studentId);
        System.out.println("Student Name: " + firstName + " " + lastName);
        System.out.println("Course: " + course);
        System.out.println("Section: " + section);

        System.out.print("Midterm Exam Score: ");
        int midtermScore = scanner.nextInt();

        System.out.print("Final Exam Score: ");
        int finalScore = scanner.nextInt();

        System.out.print("Project Score: ");
        int projectScore = scanner.nextInt();

        System.out.print("Attendance Percentage: ");
        int attendanceScore = scanner.nextInt();

        int allOverScore = midtermScore + finalScore + projectScore +
                attendanceScore;
        double averageScore = (double) allOverScore / 400 * 100;

        System.out.println("STUDENT SCORE");
        System.out.println("Midterm Exam Score: " + midtermScore);
        System.out.println("Final Exam Score: " + finalScore);
        System.out.println("Project Score: " + projectScore);
        System.out.println("Attendance Score: " + attendanceScore);
        System.out.println("Average Score: " + averageScore);

        if (averageScore >= 75) {
            System.out.println("Remarks: PASSED");
        } else {
            System.out.println("Remarks: FAILED");
        }
        scanner.close();
    }
}