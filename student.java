class Student {
    String studentName;
    int[] marks = new int[5];

    public Student(String name, int[] marks) {
 studentName = name;
marks = marks;
    }

    public int calculateTotalMarks() {
        int total = 0;
        for (int mark : marks) {
            total += mark;
        }
        return total;
    }

    public double calculateGPA() {
        int totalMarks = calculateTotalMarks();
        return totalMarks / 5.0;
    }
}

studenttest{
    public static void main(String[] args) {
        int[] studentMarks = {85, 90, 88, 92, 87};
        Student student = new Student("Alice", studentMarks);

        System.out.println("Student Name: " + student.studentName);
        System.out.println("Total Marks: " + student.calculateTotalMarks());
        System.out.println("GPA: " + student.calculateGPA());
    }
}
