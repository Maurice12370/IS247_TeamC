import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Student {
    private String name;
    private int age;
    private String studentID;
    private String course;

    public Student(String name, int age, String studentID, String course) {
        this.name = name;
        this.age = age;
        this.studentID = studentID;
        this.course = course;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    // Overloaded methods for demonstration
    public void updateInfo(String name) {
        this.name = name;
    }

    public void updateInfo(int age) {
        this.age = age;
    }
}

class Admin {
    private List<Student> students = new ArrayList<>();

    public void addStudent() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter name: ");
        String name = scanner.nextLine();
        System.out.print("Enter age: ");
        int age = scanner.nextInt();
        scanner.nextLine();  // Consume newline
        System.out.print("Enter student ID: ");
        String studentID = scanner.nextLine();
        System.out.print("Enter course: ");
        String course = scanner.nextLine();

        Student student = new Student(name, age, studentID, course);
        students.add(student);
        System.out.println("Student added successfully.");
    }

    public void updateStudent() {
        // Implement the method to update student details
    }

    public void deleteStudent() {
        // Implement the method to delete a student
    }

    public void searchStudent() {
        // Implement the method to search for a student
    }

    public void generateReport() {
        // Implement the method to generate a report of students
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Admin admin = new Admin();
        while (true) {
            System.out.println("1. Add Student");
            System.out.println("2. Update Student");
            System.out.println("3. Delete Student");
            System.out.println("4. Search Student");
            System.out.println("5. Generate Report");
            System.out.println("6. Exit");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    admin.addStudent();
                    break;
                case 2:
                    admin.updateStudent();
                    break;
                case 3:
                    admin.deleteStudent();
                    break;
                case 4:
                    admin.searchStudent();
                    break;
                case 5:
                    admin.generateReport();
                    break;
                case 6:
                    System.exit(0);
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}
