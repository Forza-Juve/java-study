package StudentManagementSystemV5;

import java.util.ArrayList;

public class TestMain {
    public static void main(String[] args) {
        Student s1 = new Student(1, "Tom", Gender.MALE, 16, 78.9);
        Student s2 = new Student(2, "Jack", Gender.MALE, 18, 89.1);
        Student s3 = new Student(3, "Alice", Gender.FEMALE, 19, 91.2);
        Student s4 = new Student(4, "Lucy", Gender.FEMALE, 17, 85.9);

        ArrayList<Student> students = null;
        //测试单个添加
        students = StudentManager.addStudent(s1);
        if (students != null) {
            System.out.println("测试单个添加-----------------------");
            System.out.println(students);
        }
        //测试批量添加
        students = StudentManager.addStudent(s2, s3, s4);
        if (students != null) {
            System.out.println("测试批量添加-----------------------");
            System.out.println(students);
        }
        //查询全部学生
        System.out.println("查询全部学生-----------------------");
        StudentManager.showAllStudent();
        //ID查询学生
        Student findStudent = StudentManager.findStudentById(3);
        if (findStudent != null) {
            System.out.println("ID查询学生-----------------------");
            System.out.println(findStudent);
        }
        //Class
        if (findStudent != null) {
            System.out.println("Class-----------------------");
            StudentManager.printStudentClassInfo(findStudent);
        }
    }
}
