public class GraduateStudent extends Student{
    private String researchTopic;

    public GraduateStudent(String name, int age,String school,String researchTopic) {
        super(name, age,school);
        this.researchTopic = researchTopic;
    }

    public void introduce() {
        super.introduce();
        System.out.printf("researchTopic is %s.",this.researchTopic);
    }
}
