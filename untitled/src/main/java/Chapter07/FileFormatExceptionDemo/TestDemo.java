package Chapter07.FileFormatExceptionDemo;

public class TestDemo {

    public static void main(String[] args) {
        TestDemo test = new TestDemo();
        try {
            test.readData(2,1);
        } catch (FileFormatException e) {
            System.out.println(e.getMessage());
        }

        try {
            test.readData(2,2);
        } catch (FileFormatException e) {
            System.out.println(e.getMessage());
        }
    }

    public void readData(int fileLength,int readLength) throws FileFormatException{
        if (readLength != fileLength){
            throw new FileFormatException("声明长度：" + fileLength + "，实际读取：" + readLength);
        } else {
            System.out.println("读取成功");
        }
    }
}
