import java.util.ArrayList;
import java.util.List;
public class Course {
    //fields
    private String courseName;
    private String courseID;
    private List<Student> enrolledStudents;
    //overloaded constructor
    public Course(String courseName, String courseID){
        this.courseName = courseName;
        this.courseID = courseID;
        this.enrolledStudents = new ArrayList<>();
    }
    //getters
    public String getCourseName(){
        return courseName;
    }
    public String getCourseID(){
        return courseID;
    }
    public List<Student> getEnrolledStudents(){
        return enrolledStudents;
    }
    //add and remove students
    public void addStudent(Student student){
        enrolledStudents.add(student);
    }
    public void removeStudent(Student student){
        enrolledStudents.remove(student);
    }
}
