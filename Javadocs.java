
/**
 * The Student class represents a student with basic details such as name, age, studentID, and course.
 */
class Student {
    /**
     * The name of the student.
     */
    private String name;

    /**
     * The age of the student.
     */
    private int age;

    /**
     * The unique student ID.
     */
    private String studentID;

    /**
     * The course the student is enrolled in.
     */
    private String course;

    /**
     * Constructs a new Student with the specified details.
     *
     * @param name      the name of the student
     * @param age       the age of the student
     * @param studentID the unique student ID
     * @param course    the course the student is enrolled in
     */
    public Student(String name, int age, String studentID, String course) {
        this.name = name;
        this.age = age;
        this.studentID = studentID;
        this.course = course;
    }

    // Getters and Setters

    /**
     * Returns the name of the student.
     *
     * @return the name of the student
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name of the student.
     *
     * @param name the new name of the student
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Returns the age of the student.
     *
     * @return the age of the student
     */
    public int getAge() {
        return age;
    }

    /**
     * Sets the age of the student.
     *
     * @param age the new age of the student
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * Returns the student ID.
     *
     * @return the student ID
     */
    public String getStudentID() {
        return studentID;
    }

    /**
     * Sets the student ID.
     *
     * @param studentID the new student ID
     */
    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    /**
     * Returns the course the student is enrolled in.
     *
     * @return the course the student is enrolled in
     */
    public String getCourse() {
        return course;
    }

    /**
     * Sets the course the student is enrolled in.
     *
     * @param course the new course the student is enrolled in
     */
    public void setCourse(String course) {
        this.course = course;
    }

    // Overloaded methods for demonstration

    /**
     * Updates the name of the student.
     *
     * @param name the new name of the student
     */
    public void updateInfo(String name) {
        this.name = name;
    }

    /**
     * Updates the age of the student.
     *
     * @param age the new age of the student
     */
    public void updateInfo(int age) {
        this.age = age;
    }
}

/**
 * The Admin class manages a list of students and provides methods to perform operations on the students.
 */
class Admin {
    /**
     * List of students.
     */
    private List<Student> students = new ArrayList<>();

    /**
     * Adds a new student to the list.
     */
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

    /**
     * Updates the details of an existing student.
     */
    public void updateStudent() {
        // Implement the method to update student details
    }

    /**
     * Deletes a student from the list.
     */
    public void deleteStudent() {
        // Implement the method to delete a student
    }

    /**
     * Searches for a student based on some criteria.
     */
    public void searchStudent() {
        // Implement the method to search for a student
    }

    /**
     * Generates a report of all students.
     */
    public void generateReport() {
        // Implement the method to generate a report of students
    }
}

/**
 * The Main class provides the command-line interface for the user to interact with the student management system.
 */
public class Main {
    /**
     * The entry point of the application.
     *
     * @param args the command-line arguments
     */
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
