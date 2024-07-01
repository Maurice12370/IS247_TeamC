public class GraduateStudent extends Student {
    private String thesisTitle;

    public GraduateStudent(String name, int age, String studentIO, String course, String thesisTitle) {
        super(name, age, studentID, course);
        this.thesisTitle = thesisTitle;
    }

    public String getThesisTitle() {return thesisTitle;}

    public void setThesisTitle(String thesisTitle){this.thesisTitle = thesisTitle;}

    @Override
    public void updateInfo(String name){super.updateInfo(name);}
}