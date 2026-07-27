package LambdaDemo06_VariableScope;

public class LambdaDemo06 {
    private String message = "Hello";

    public static void main(String[] args) {
        String message = "Hello Lambda";

        Printer printer = () -> System.out.println(message);
        //message = "Java";
        printer.print();

        LambdaDemo06 lambdaDemo06 = new LambdaDemo06();

        lambdaDemo06.text();
    }

    private void text(){

        Printer printer = () -> System.out.println(this.message);
        this.message = "Java";
        printer.print();

    }
}
