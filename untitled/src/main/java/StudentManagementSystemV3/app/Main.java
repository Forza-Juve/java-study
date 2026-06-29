package StudentManagementSystemV3.app;

import StudentManagementSystemV3.entity.Student;
import StudentManagementSystemV3.service.StudentManager;
import StudentManagementSystemV3.service.StudentPrinter;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student(1,"Tom",20,"Java");
        Student s2 = new Student(2,"Jack",19,"AI");
        Student s3 = new Student(3,"Lucy",18,"Math");
        Student s4 = new Student();

        Student[] students = {s1,s2,s3,s4};

        StudentPrinter sp = new StudentPrinter();
        sp.printStudent(s1);
        sp.printStudents(students);
        Student.showTotalStudents();
    }
}
