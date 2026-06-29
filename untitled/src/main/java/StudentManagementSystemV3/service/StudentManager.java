package StudentManagementSystemV3.service;

import StudentManagementSystemV3.entity.Student;

public class StudentManager {
    public static Student[] student = new Student[Student.totalStudents];
    private static int studentIndex = 0;
//
//    public void addStudent(Student student){
//        //System.out.println(this.student.length);
//        this.student[studentIndex] = student;
//        studentIndex++;
//    }
//
//    public void showAllStudents(){
//       for(Student student : student){
//           student.showInfo();
//       }
//    }
//
//    public Student findStudentById(int id){
//        for (Student student : student){
//            if(student.getId() == id){
//                return student;
//            }
//        }
//        return null;
//    }
//
//    public String updateMajor(int id,String newMajor){
//        for (int i = 0; i < student.length; i++) {
//            if(student[i].getId() == id){
//                student[i].setMajor(newMajor);
//                return "success";
//            }
//        }
//        return "failure";
//    }
}
