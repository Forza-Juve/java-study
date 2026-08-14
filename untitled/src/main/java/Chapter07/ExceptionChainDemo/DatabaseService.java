package Chapter07.ExceptionChainDemo;

import java.sql.SQLException;

public class DatabaseService {
    public void query(){
        try {
            throw new SQLException("数据库连接失败");
        } catch (SQLException e) {
            RuntimeException re = new RuntimeException("用户数据查询失败");
            re.initCause(e);
            throw re;
        }
    }
}
