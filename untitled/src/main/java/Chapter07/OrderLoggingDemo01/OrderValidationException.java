package Chapter07.OrderLoggingDemo01;

public class OrderValidationException extends RuntimeException{

    public OrderValidationException(String message){
        super(message);
    }
}
