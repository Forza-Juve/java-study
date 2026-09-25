package Chapter09.EmployeeRosterDemo;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(List.of("A", "B", "C", "D", "E", "F"));
        EmployeeRoster er = new EmployeeRoster(list);

        er.removeRange(2,4);
        System.out.println(list);

        List<String> readOnly = er.getReadOnlyView();
        //readOnly.add("G");
        //注释掉，UnsupportedOperationException

        er.addEmployee("H");
        System.out.println(readOnly);

        List<String> checkedList = er.getCheckedRawAccess();
        List rawList = checkedList;
        //rawList.add(new Object());
        //ClassCastException
    }
}
