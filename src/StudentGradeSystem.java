import java.util.ArrayList;
import java.util.Scanner;

public class StudentGradeSystem {

    static ArrayList<Student> students = new ArrayList<>();
    static Scanner input = new Scanner(System.in);

    public static void addStudent() {
        System.out.print("Enter Student ID: ");
        String id = input.nextLine();

        System.out.print("Enter Student Name: ");
        String name = input.nextLine();

        System.out.print("Enter Marks: ");
        double marks = input.nextDouble();
        input.nextLine();

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

    public static void searchStudent() {
        System.out.print("Enter Student ID to Search: ");
        String id = input.nextLine();

        for (Student s : students) {
            if (s.getStudentId().equals(id)) {
                System.out.println("\nStudent Found");
                System.out.println("ID: " + s.getStudentId());
                System.out.println("Name: " + s.getStudentName());
                System.out.println("Marks: " + s.getMarks());
                return;
            }
        }

        System.out.println("Student Not Found");
    }

    public static void calculateAverage() {
        if (students.isEmpty()) {
            System.out.println("No Students Available.");
            return;
        }

        double total = 0;

        for (Student s : students) {
            total += s.getMarks();
        }

        double average = total / students.size();

        System.out.println("Average Marks: " + average);
    }

    public static void main(String[] args) {

        int choice;

        do {
            System.out.println("\n===== Student Grade Management System =====");
            System.out.println("1. Add Student");
            System.out.println("2. Display All Students");
            System.out.println("3. Search Student by ID");
            System.out.println("4. Calculate Average Marks");
            System.out.println("5. Exit");
            System.out.print("Enter Choice: ");

            choice = input.nextInt();
            input.nextLine();

            switch (choice) {
                case 1:
                    addStudent();
                    break;

                case 2:
                    displayStudents();
                    break;

                case 3:
                    searchStudent();
                    break;

                case 4:
                    calculateAverage();
                    break;

                case 5:
                    System.out.println("Thank You!");
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }

        } while (choice != 5);
    }
}