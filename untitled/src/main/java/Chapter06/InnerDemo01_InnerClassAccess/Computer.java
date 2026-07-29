package Chapter06.InnerDemo01_InnerClassAccess;

public class Computer {
    private String brand;
    private int price;

    public Computer(String brand, int price) {
        this.brand = brand;
        this.price = price;
    }

    class CPU{
        private String type;

        public CPU(String type) {
            this.type = type;
        }

        public void showInfo(){
            System.out.println("电脑品牌：" + Computer.this.brand + "\n"
                    + "电脑价格：" + Computer.this.price + "\n" +
                    "CPU：" + this.type);
        }

        public void printObject(){
            System.out.println(Computer.this.getClass().getName());
            System.out.println(this.getClass().getName());
        }
    }
}
