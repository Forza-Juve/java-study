package StudentManagementSystemV4;

import java.util.ArrayList;

public class TestStudent {
    public static void main(String[] args) {
        //├── 新增学生

        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student(1, "张三", 18, "男"));
        students.add(new Student(2, "李四", 19, "女"));
        students.add(new Student(3, "王五", 20, "女"));
        students.add(new Student(4, "赵六", 21, "男"));
        System.out.println("----------新增学生----------");


        //── 根据学号查找学生
        System.out.println("----------根据学号查找学生----------");
        if (findStudentById(3, students) != null) {
            System.out.println(findStudentById(3, students).toString());
        }

//── 修改学生信息
        System.out.println("----------修改学生信息----------");
        Student newStudent = new Student(5, "田七", 22, "女");
        Student oldStudent = updateStudentById(3, students, newStudent);
        if (oldStudent != null) {
            System.out.println(oldStudent + ",被替换为了：" + newStudent);
        }

//── 删除学生
        System.out.println("----------删除学生----------");
        Student student = removeStudentById(2, students);
        if (student != null) {
            System.out.println("删除了：" + student);
        }

//── 显示所有学生
        System.out.println("----------显示所有学生----------");
        printStudents(students);

        //── 显示学生总人数（size()）
        System.out.println("----------显示学生总人数----------");
        System.out.println(students.size());
    }

    public static Student findStudentById(int id, ArrayList<Student> students) {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getId() == id) {
                return students.get(i);
            }
        }
        return null;
    }

    public static Student removeStudentById(int id, ArrayList<Student> students) {
        Student student = null;
        for (int i = 0; i < students.size(); i++) {
            if (id == students.get(i).getId()) {
                student = students.get(i);
                students.remove(i);
            }
        }
        return student;
    }

    public static Student updateStudentById(int id, ArrayList<Student> students, Student newStudent) {
        Student oldStudent = null;
        for (int i = 0; i < students.size(); i++) {
            if (id == students.get(i).getId()) {
                oldStudent = students.get(i);
                students.set(i, newStudent);

                //修改对象
//              students.get(i).setId(newStudent.getId());
//              students.get(i).setName(newStudent.getName());
//              students.get(i).setAge(newStudent.getAge());
//              students.get(i).setGender(newStudent.getGender());
            }

        }
        return oldStudent;
    }

    public static void printStudents(ArrayList<Student> students) {
        for (Student s : students) {
            System.out.println(s);
        }
    }
}
