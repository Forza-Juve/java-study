public class ExtendTest {
    public static void main(String[] args) {
        Person p = new Person("p",5000);
        Student s = new Student("s",18,"MIT");
        GraduateStudent gs = new GraduateStudent("gs",28,"Stanford","AI");
        p.introduce();
        s.introduce();
        gs.introduce();
    }
}
