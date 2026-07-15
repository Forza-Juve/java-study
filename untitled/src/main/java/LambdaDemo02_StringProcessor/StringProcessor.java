package LambdaDemo02_StringProcessor;

public interface StringProcessor {
    String process(String text);
    public static void handle(StringProcessor processor,String text){
        System.out.println(processor.process(text));
    }
}
