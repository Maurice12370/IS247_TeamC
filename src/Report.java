public class Report {
    public void generateStudentReport(Student student) {
        System.out.println("Student Report:");
        System.out.println("ID: " + student.getStudentID());
        System.out.println("Name: " + student.getName());
        System.out.println("Age: " + student.getAge());
        System.out.println("Course: " + student.getCourse());
    }
}
