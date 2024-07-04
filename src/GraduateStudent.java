public class GraduateStudent extends Student {
    private String researchTopic;

    public GraduateStudent(String name, int age, String studentID, String course, String researchTopic) {
        super(name, age, studentID, course);
        this.researchTopic = researchTopic;
    }

    public String getResearchTopic() {
        return researchTopic;
    }

    public void setResearchTopic(String researchTopic) {
        this.researchTopic = researchTopic;
    }

    @Override
    public void updateInfo(int age) {
        super.updateInfo(age);
    }
}
