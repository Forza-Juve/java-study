package InterfaceDemo.Demo01InterfaceBasics;

public class FootballPlayer implements Playable{
    @Override
    public void play() {
        System.out.println("踢足球");
    }
}
