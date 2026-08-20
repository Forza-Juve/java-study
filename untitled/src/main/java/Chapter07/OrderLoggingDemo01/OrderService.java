package Chapter07.OrderLoggingDemo01;

import java.io.IOException;
import java.util.Arrays;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class OrderService {
    private static final Logger logger = Logger.getLogger(OrderService.class.getName());

    public void createOrder(Order order){
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

        if(order.getAmount() <= 0){
            var e = new OrderValidationException("订单创建失败,amount参数错误，orderId="+order.getOrderId()+"，amount="+order.getAmount());
            //这里保存了异常，就不重复写参数内容了
            logger.log(Level.SEVERE,Arrays.toString(e.getStackTrace()),e);
            throw e;
        }

        logger.log(Level.INFO,"开始创建订单，orderId="+order.getOrderId()+"，amount="+order.getAmount());
        //模拟创建订单
        logger.log(Level.INFO,"订单创建成功");
    }

}
