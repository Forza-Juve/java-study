package Chapter07.ExceptionChainDemo;

public class ExceptionChainDemo {
    public static void main(String[] args) {
        DatabaseService ds = new DatabaseService();
        try {
            ds.query();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println(e.getCause().getMessage());
        }
    }
}
/*
为什么不直接把 SQLException 抛给调用者？
调用方不需要知道底层异常，只需要知道调用的业务层的异常

异常包装为什么必须保留 cause？
因为整个异常链路是需要保存下来的，处理异常的地方可以看到最底层的异常是什么

如果没有：

initCause()

会有什么问题？
会覆盖底层异常，导致不知道最底层的原因是什么
 */