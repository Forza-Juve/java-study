package Chapter07.BusinessExceptionDemo;

public class TestDemo {

    public static void main(String[] args) {
        TestDemo t = new TestDemo();
        System.out.println(t.createOrder(10));

        try {
            t.createOrder(0);
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }

    public boolean createOrder(int stock){
        if(stock > 0){
            return true;
        }else {
            throw new BusinessException("库存不足");
        }
    }
}
