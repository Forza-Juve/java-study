package StudentManagementSystemV5;

import java.util.ArrayList;

public class StudentManager {
    public static ArrayList<Student> studentList = new ArrayList<>();

    //1. 添加学生
    public static ArrayList<Student> addStudent(Student student){
        studentList.add(student);
        return studentList;
    }


    //2. 批量添加学生（★★★★★）
    public static ArrayList<Student> addStudent(Student... students){
        for (Student s : students){
            studentList.add(s);
        }
        return studentList;
    }

    //3. 查询全部学生
    public static void showAllStudent(){
        for (Student s : studentList){
            System.out.println(s);
        }
    }

    //4. 根据 id 查询
    public static Student findStudentById(Integer id){
        for(Student s : studentList){
            if(id.equals(s.getId())){
                return s;
            }
        }
        return null;
    }

    public static void printStudentClassInfo(Student student){
        System.out.println("类："+student.getClass()+"，类名："+student.getClass().getSimpleName());
    }
}
