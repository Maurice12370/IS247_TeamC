public class Student extends BaseEntity {
    private String name;
    private int age;
    private String course;

    public Student(String name, int age, String studentID, String course) {
        super(studentID);
        this.name = name;
        this.age = age;
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
        return super.getId();
    }

    public void setStudentID(String studentID) {
        super.setId(studentID);
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
