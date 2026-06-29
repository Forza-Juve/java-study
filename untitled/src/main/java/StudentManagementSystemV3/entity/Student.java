package StudentManagementSystemV3.entity;

public class Student {
    public int id;
    public String name;
    public int age;
    public String major;

    public static int totalStudents;

    public Student(){
        this("Unknown");
    }

    public Student(String name){
        this(0,name,0,"Undeclared");
    }

    public Student(int id,String name,int age,String major){
        this.id = id;
        this.name = name;
        this.age = age;
        this.major = major;
        totalStudents++;
    }

    public void showInfo(){
        System.out.printf("编号：%d%n姓名：%s%n年龄：%d%n专业：%s%n",id,name,age,major);
    }

    public static void showTotalStudents(){
        System.out.println("当前学生数量="+totalStudents);
    }

}
