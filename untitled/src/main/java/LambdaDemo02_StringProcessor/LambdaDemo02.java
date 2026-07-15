package LambdaDemo02_StringProcessor;

public class LambdaDemo02 {
    public static void main(String[] args) {
        String text = "Hello Java Lambda";
        //全部转大写
        StringProcessor.handle(s -> s.toUpperCase(),text);
        //全部转小写
        StringProcessor.handle(s -> s.toLowerCase(),text);
        //去掉所有空格
        StringProcessor.handle(s -> s.replace(" ", ""),text);
        //在字符串前后加上
        StringProcessor.handle(s -> String.format("***%s***", s),text);
    }
}
