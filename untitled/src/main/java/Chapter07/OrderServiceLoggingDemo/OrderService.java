package Chapter07.OrderServiceLoggingDemo;

import java.util.logging.Level;
import java.util.logging.Logger;

public class OrderService {
    private static final Logger logger = Logger.getLogger("com.example.order.OrderService");

    public Order findById(long id){
        if(id <= 0){
            throw new IllegalArgumentException("参数不合法");
        }else if(id == 1001){
            //这里偷懒了，直接写死了代码
            logger.log(Level.INFO,"查询成功，订单id："+id);
            return new Order(1001,"Java书籍",99);
        }else if(id == 1002){
            logger.log(Level.INFO,"查询成功，订单id："+id);
            return new Order(1002,"键盘",299);
        }else{
            logger.log(Level.WARNING,"查询失败，订单id："+id);
            return null;
        }
    }
}
