package InterfaceDemo.Demo01InterfaceBasics;

public class Test1Demo {
    public static void main(String[] args) {
        Playable p1 = new FootballPlayer();
        Playable p2 = new PianoPlayer();
        p1.play();
        p2.play();
    }
}
