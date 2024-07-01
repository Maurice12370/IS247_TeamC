import java.util.List;
public class Report {
    public void generateStudentReport(List<Student> students){
        for (Student student : students) {
            System.out.println("Student ID: %s, Name: %s, Course: %s\n", student.getStudentID(), student.getName(), student.getCourse());
        }
    }

    public void generateCourseReport(Course course) {
        System.out.println("Course ID: %s, Course Name: %s\n", course.getCourseID(), course.getCourseName());
        List<Student> students = course.getEnrolledStudents();
        for (Student student : students){
            System.out.println("Student ID: %s, Name: %s\n", student.getStudentID(), student.getName());
        }
    }
}
