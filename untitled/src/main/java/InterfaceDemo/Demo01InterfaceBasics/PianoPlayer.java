package InterfaceDemo.Demo01InterfaceBasics;

public class PianoPlayer implements Playable{
    @Override
    public void play() {
        System.out.println("弹钢琴");
    }
}
