package Chapter08.GenericPairDemo;

import java.time.LocalDate;

public class DatePair extends Pair<LocalDate>{

    public DatePair(LocalDate first, LocalDate second) {
        super(first, second);
    }

    @Override
    public void setSecond(LocalDate second){
        if(second.compareTo(super.getFirst()) < 0){
            throw new RuntimeException("second必须大于first，first="+super.getFirst()+"，second="+second);
        }
        super.setSecond(second);
    }
}
