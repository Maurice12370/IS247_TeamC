import java.util.*;

public class Admin implements StudentManagementInterface {
    private Map<String, Student> studentMap;

    public Admin() {
        studentMap = new HashMap<>();
    }

    @Override
    public void addStudent() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter name: ");
        String name = input.nextLine();
        System.out.println("Enter age: ");
        int age = input.nextInt();
        input.nextLine(); // Consume newline
        System.out.println("Enter Student ID: ");
        String studentID = input.nextLine();
        System.out.println("Enter Course: ");
        String course = input.nextLine();
        Student student = new Student(name, age, studentID, course);
        studentMap.put(studentID, student);
    }

    @Override
    public void deleteStudent() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Student ID to delete: ");
        String studentID = input.nextLine();
        studentMap.remove(studentID);
    }

    @Override
    public void updateStudent() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Student ID: ");
        String studentID = input.nextLine();
        if (studentMap.containsKey(studentID)) {
            Student student = studentMap.get(studentID);
            System.out.println("Enter new name: ");
            String name = input.nextLine();
            System.out.println("Enter new age: ");
            int age = input.nextInt();
            input.nextLine(); // Consume newline
            System.out.println("Enter new course: ");
            String course = input.nextLine();
            student.setName(name);
            student.setAge(age);
            student.setCourse(course);
            System.out.println("Student information updated.");
        } else {
            System.out.println("Student ID not found.");
        }
    }

    @Override
    public void searchStudent() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Student ID to search: ");
        String studentID = input.nextLine();
        Student student = studentMap.get(studentID);
        if (student != null) {
            System.out.println("Student found: " + student.getName() + ", Age: " + student.getAge() + ", Course: " + student.getCourse());
        } else {
            System.out.println("Student not found.");
        }
    }

    @Override
    public void generateReport() {
        for (Map.Entry<String, Student> entry : studentMap.entrySet()) {
            Student student = entry.getValue();
            System.out.println("ID: " + student.getStudentID() + ", Name: " + student.getName() + ", Age: " + student.getAge() + ", Course: " + student.getCourse());
        }
    }
}
