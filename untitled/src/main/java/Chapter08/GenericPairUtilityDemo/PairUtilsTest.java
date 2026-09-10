package Chapter08.GenericPairUtilityDemo;

public class PairUtilsTest {
    public static void main(String[] args) {
        /*
        至少测试：
        Pair<String>
        Pair<Integer>
        Pair<Employee>
         */
        Pair<String> stringPair = new Pair<>("A","B");
        PairUtils.swap(stringPair);
        System.out.println(stringPair);

        Pair<Integer> integerPair = new Pair<>(1,2);
        PairUtils.swap(integerPair);
        System.out.println(integerPair);

        Pair<Employee> employeePair = new Pair<>(new Employee("a",1),new Employee("b",2));
        PairUtils.swap(employeePair);
        System.out.println(employeePair);

        System.out.println(PairUtils.getFirst(stringPair));
        System.out.println(PairUtils.getFirst(integerPair));
        System.out.println(PairUtils.getFirst(employeePair));

        Employee employee = new Employee("c",3);
        PairUtils.setEmployee(employeePair,employee);
        System.out.println(employeePair);

        Pair<Object> objectPair = new Pair<>(new Object(),new Object());
        PairUtils.setEmployee(objectPair,employee);
        System.out.println(objectPair);

        //然后尝试向其中设置 Employee
        //不是很明白为什么要设置Employee，明显类型不匹配
        //PairUtils.test(employee);
    }
}
