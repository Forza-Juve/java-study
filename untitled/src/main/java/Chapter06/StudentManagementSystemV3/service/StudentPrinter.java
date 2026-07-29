package Chapter06.StudentManagementSystemV3.service;

import Chapter06.StudentManagementSystemV3.entity.Student;

public class StudentPrinter {
    public static void printStudent(Student student){
        System.out.println("==========");
        student.showInfo();
        System.out.println("==========");
    }

    public static void printStudents(Student[] students){
        for(Student s : students){
            if(s == null){
                continue;
            }
            printStudent(s);
        }
    }
}
