package InterfaceDemo.CallbackTimerDemo;

public class MorningAlarm implements AlarmTask{
    @Override
    public void alarm() {
        System.out.println("下午3点提醒开会");
    }
}
