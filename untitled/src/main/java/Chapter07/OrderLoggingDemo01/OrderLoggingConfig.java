package Chapter07.OrderLoggingDemo01;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class OrderLoggingConfig {

    public static void configure(Logger logger){
        try {
            FileHandler fileHandler = new FileHandler("C:\\Users\\Juve\\Desktop\\order.log");
            OrderSuccessFilter successFilter = new OrderSuccessFilter();
            fileHandler.setFilter(successFilter);
            OrderLogFormatter logFormatter = new OrderLogFormatter();
            fileHandler.setFormatter(logFormatter);
            logger.addHandler(fileHandler);
        } catch (IOException e) {
            logger.log(Level.SEVERE,"日志文件Handler创建失败",e);
            throw new RuntimeException(e);
        }
    }
}
