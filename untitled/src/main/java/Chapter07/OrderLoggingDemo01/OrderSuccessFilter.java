package Chapter07.OrderLoggingDemo01;

import java.util.logging.Filter;
import java.util.logging.LogRecord;

public class OrderSuccessFilter implements Filter {
    @Override
    public boolean isLoggable(LogRecord record) {
        if("订单创建成功".equals(record.getMessage())){
            return true;
        } else if (record.getThrown() != null){
            return true;
        }
        return false;
    }
}
