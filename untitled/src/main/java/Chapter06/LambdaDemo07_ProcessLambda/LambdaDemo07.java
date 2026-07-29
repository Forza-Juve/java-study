package Chapter06.LambdaDemo07_ProcessLambda;

public class LambdaDemo07 {
    public static void main(String[] args) {
        String text = "java lambda";
        //需求1：转换大写
        String upString = LambdaUtil.processString(String::toUpperCase,text);
        System.out.println(upString);
        //需求2：添加前缀
        String preString = LambdaUtil.processString(s -> "学习："+s, text);
        System.out.println(preString);
        //需求3：统计长度
        //int length =LambdaUtil.processString(s -> s.length(),text);
        //和接口的返回值不匹配，接口是String，这里是int

    }
}
