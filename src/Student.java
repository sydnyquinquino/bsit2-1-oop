public class Student {
    String name;
    int age;
    String course;
    double grade1, grade2, grade3;

    public Student(String studentName, int studentAge, String studentCourse, double studentGrade1, double studentGrade2, double studentGrade3) {
        name = studentName;
        age = studentAge;
        course = studentCourse;
        grade1 = studentGrade1;
        grade2 = studentGrade2;
        grade3 = studentGrade3;
    }

    public void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age + ", Course: " + course);
        System.out.println("Grades: " + grade1 + ", " + grade2 + ", " + grade3);
    }

    public double calculateAverage() {
        return (grade1 + grade2 + grade3) / 3.0;
    }

    public char getLetterGrade() {
        double avg = calculateAverage();
        if (avg >= 90) return 'A';
        else if (avg >= 80) return 'B';
        else if (avg >= 70) return 'C';
        else if (avg >= 60) return 'D';
        else return 'F';
    }

    public boolean isPassing() {
        return calculateAverage() >= 70;
    }
}
