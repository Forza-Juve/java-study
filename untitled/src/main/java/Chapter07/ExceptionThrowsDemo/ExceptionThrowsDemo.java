package Chapter07.ExceptionThrowsDemo;

public class ExceptionThrowsDemo {
    public static void main(String[] args) throws Exception{
        FileService fs = new FileService();
        try {
            fs.readConfig("失败");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            fs.readConfig("成功");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        fs.readConfig("失败");
    }
}
/*
 1.为什么 readConfig() 不捕获异常，而选择 throws？
 答：我推测是这个方法应该处理业务，不处理异常，这是根据业务需求，没有标准答案

 2.异常最终应该在哪里处理？
 答：这个Demo里是main方法，实际看具体的业务需求

 3.

如果 main 方法也写：

throws Exception

会有什么问题？
答：会导致程序中断

建议少稳一点是是而非的问题


 */