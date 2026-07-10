package InterfaceDemo.CallbackTimerDemo;

public class TimerTest {
    public static void main(String[] args) {
        AlarmTask at1 = new MorningAlarm();
        AlarmTask at2 = new MeetingAlarm();
        SimpleTimer st = new SimpleTimer();
        st.start(at1);
        st.start(at2);
    }
}
