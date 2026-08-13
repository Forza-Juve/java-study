package Chapter07.ExceptionPropagationDemo;

public class TestDemo {

    public static void main(String[] args) {
        TestDemo t = new TestDemo();
        try {
            t.service(-1);
        } catch (DataException e) {
            System.out.println(e.getMessage());
        }

        try {
            t.service(10);
        } catch (DataException e) {
            System.out.println(e.getMessage());
        }
    }

    public void service(int value) throws DataException {
        readData(value);
    }

    public void readData(int value) throws DataException {
        if(value < 0){
            throw new DataException("参数能不小于0，此参数为：" + value);
        }else {
            System.out.println("执行成功");
        }
    }
}
