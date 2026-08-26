package Chapter08.GenericPairDemo;

import java.time.LocalDate;
import java.util.Date;

public class Test {
    public static void main(String[] args) {
//        Pair<String> p1 = new Pair<>("Java","MySQL");
//        System.out.println(p1.getFirst());
//        System.out.println(p1.getSecond());
//        p1.setFirst("MySQL");
//        p1.setSecond("Java");
//        p1.swap();
//        System.out.println(p1);
//
//        Pair<Integer> p2 = new Pair<>(100,200);
//        System.out.println(p2);
//
//        Pair<String> p3 = PairUtils.create("test3", "p3");
//        System.out.println(p3);
//        Pair<Integer> p4 = PairUtils.create(4, 4);
//        System.out.println(p4);
//
//        Pair<Integer> p5 = PairUtils.copy(p4);
//        System.out.println(p5+"p4==p5:"+ (p4==p5));
//
//        DatePair dp1 = new DatePair(LocalDate.of(2026,8,1),LocalDate.of(2026,8,10));
//        System.out.println(dp1);
//        dp1.setSecond(LocalDate.of(2026,8,20));
//        System.out.println(dp1);
//        try {
//            dp1.setSecond(LocalDate.of(2026,7,20));
//            System.out.println("测试失败");
//        } catch (RuntimeException e) {
//            System.out.println("测试通过"+e);
//        }
//
//        Pair<LocalDate> pair = dp1;
//        pair.setSecond(LocalDate.of(2026,8,25));
//        System.out.println(pair);
//        try {
//            pair.setSecond(LocalDate.of(2026, 7, 20));
//            System.out.println("测试失败");
//        } catch (RuntimeException e) {
//            System.out.println("测试通过"+e);
//        }

        // 新代码：使用泛型
        Pair<String> stringPair = new Pair<>("Java", "MySQL");

        // 传给遗留代码
        LegacyPairStore store = new LegacyPairStore();
        store.setPair(stringPair);

        // 从遗留代码取出
        //@SuppressWarnings("unchecked")
        Pair<String> result = store.getPair();

        System.out.println(result);
        System.out.println(result.getFirst());
        System.out.println(result.getSecond());

    }
}
