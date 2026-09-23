package Chapter09.WeeklyScheduleDemo;

import java.util.EnumMap;
import java.util.EnumSet;

public class Test {
    public static void main(String[] args) {
        EnumSet<Day> days = EnumSet.range(Day.MONDAY,Day.FRIDAY);
        System.out.println(days.contains(Day.MONDAY));
        System.out.println(days.contains(Day.SUNDAY));
        days.add(Day.SATURDAY);
        System.out.println(days.contains(Day.SATURDAY));

        EnumMap<Day, String> schedule = new EnumMap<>(Day.class);
        schedule.put(Day.MONDAY,"Coding");
        schedule.put(Day.TUESDAY,"Testing");
        schedule.put(Day.WEDNESDAY,"Meeting");
        schedule.put(Day.THURSDAY,"Coding");
        schedule.put(Day.FRIDAY,"Review");

        System.out.println(schedule.get(Day.MONDAY));
        System.out.println(schedule.get(Day.FRIDAY));
    }
}
