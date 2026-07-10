package InterfaceDemo.CallbackTimerDemo;

public class SimpleTimer {
    public void start(AlarmTask alarmTask){
        System.out.println("开始计时");
        alarmTask.alarm();
    }
}
