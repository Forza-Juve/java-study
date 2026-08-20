package Chapter07.OrderLoggingDemo01;

import java.util.logging.Formatter;
import java.util.logging.LogRecord;

public class OrderLogFormatter extends Formatter {
    @Override
    public String format(LogRecord record) {
        return record.getInstant()+"["+record.getLevel()+"]"+record.getMessage()+record.getThrown()+"\n";
    }
}
