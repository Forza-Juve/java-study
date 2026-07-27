package InnerDemo01_InnerClassAccess;

public class InnerDemo01Test {
    public static void main(String[] args) {
        Computer computer = new Computer("ASUS",100);
        Computer.CPU cpu = computer.new CPU("AMD");
        cpu.showInfo();
        cpu.printObject();
    }
}
