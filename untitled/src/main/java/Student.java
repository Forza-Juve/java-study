public class Student extends Person{
    private String school;

    public Student(String name, int age,String school) {
        super(name, age);
        this.school = school;
    }

    public void introduce(){
        super.introduce();
        System.out.printf("at %s school.%n",this.school);
    }
}
