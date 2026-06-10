import java.util.ArrayList;
import java.util.Scanner;

public class StudentGradeSystem {

    static ArrayList<Student> students = new ArrayList<>();

    public static void addStudent() {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Student ID: ");
        String id = input.nextLine();

        System.out.print("Enter Student Name: ");
        String name = input.nextLine();

        System.out.print("Enter Marks: ");
        double marks = input.nextDouble();

        students.add(new Student(id, name, marks));

        System.out.println("Student Added Successfully!");
    }

    public static void displayStudents() {
        if (students.isEmpty()) {
            System.out.println("No Students Found.");
            return;
        }

        System.out.println("\nStudent List:");

        for (Student s : students) {
            System.out.println(
                "ID: " + s.getStudentId() +
                ", Name: " + s.getStudentName() +
                ", Marks: " + s.getMarks()
            );
        }
    }

    public static void main(String[] args) {
        addStudent();
        displayStudents();
    }
}