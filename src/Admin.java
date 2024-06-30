import java.util.*;
public class Admin implements StudentManagementInterface{
    private Map<String, Student> studentMap;
    public Admin(){
        studentMap = new HashMap<>();

        @Override
        public void addStudent(){
            //declares Scanner class
            Scanner input = new Scanner(System.in);
            System.out.println("Enter name");
            //sets name
            String name = input.nextLine();
            System.out.println("Enter Student ID: ");
            //sets ID
            String studentID = input.nextLine();
            System.out.println("Enter Course: ");
            //sets course
            String course = input.nextLine();
            Student student = new Student(name, age, studentID, course);
            studentMap.put(studentID, student);
        }
        @Override
        public void deleteStudent(){
            Scanner input = new Scanner(System.in);
            System.out.println("Enter Student ID to delete: ");
            String studentID = input.nextLine();
            //deletes ID
            studentMap.remove(studentID);
        }
        @Override
        public void searchStudent(){
            Scanner input = new Scanner(System.in);
            System.out.println("Enter Student ID to search: ");
            String studentID = input.nextLine();
            Student student = studentMap.get(studentID);
            //searches id and validates input
            if (student != null){
                System.out.println("Student found: "+ student.getName());
            }
            else{
                System.out.println("Student not found");
            }

        }
        @Override
         public void generateReport(){
            //implement report generation
        }
    }


}
