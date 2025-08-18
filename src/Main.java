public static void main(String[] args) {
    GradeCalculator gc = new GradeCalculator();
    double avg = gc.calculateAverage(85.5, 92.0, 78.5, 90.0);
    gc.displayResult("John Smith", avg);
    String letter = gc.getLetterGrade(avg);
    gc.displayResult("John Smith", avg, letter);
}
