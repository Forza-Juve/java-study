package LambdaDemo07_ProcessLambda;

public class LambdaUtil {
    public static String processString(StringProcessor processor,String text){
        return processor.process(text);
    }
}
