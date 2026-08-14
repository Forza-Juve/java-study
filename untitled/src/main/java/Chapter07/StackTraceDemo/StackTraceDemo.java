package Chapter07.StackTraceDemo;

import java.util.Arrays;

public class StackTraceDemo {
    public static void main(String[] args) {
        StackTraceService sts = new StackTraceService();
        try {
            sts.levelOne();
        } catch (Exception e) {
            //System.out.println(Arrays.toString(e.getStackTrace()));
            e.printStackTrace();
        }
    }
}
/*
为什么堆栈轨迹中会同时出现 levelOne、levelTwo、levelThree？
是更具方法调用链路记录的

堆栈轨迹中的行号有什么作用？
定位异常发生在代码第几行

printStackTrace() 和 getMessage() 获取的信息有什么区别？
前者获取方法调用链路，后者获取异常保存的信息
 */