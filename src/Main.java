public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("Kate", 18, "BSCE", 85.0, 90.0, 88.0);
        Student s2 = new Student("Sydny", 19, "BSCS", 92.0, 95.0, 89.0);
        Student s3 = new Student("Charlie", 21, "BSIT", 65.0, 70.0, 68.0);

        Student[] students = {s1, s2, s3};
        int passingCount = 0;

        System.out.println("Student Information:\n");

        for (Student s : students) {
            s.displayInfo();
            double avg = s.calculateAverage();
            char grade = s.getLetterGrade();
            boolean passing = s.isPassing();

            System.out.printf("Average: %.2f\n", avg);
            System.out.println("Letter Grade: " + grade);
            System.out.println("Status: " + (passing ? "PASSING" : "FAILING"));
            System.out.println();

            if (passing) passingCount++;
        }

        System.out.println("Summary: " + passingCount + " out of " + students.length + " students are passing.");
    }
}