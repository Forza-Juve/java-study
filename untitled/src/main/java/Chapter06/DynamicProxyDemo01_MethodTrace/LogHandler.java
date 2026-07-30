package Chapter06.DynamicProxyDemo01_MethodTrace;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class LogHandler implements InvocationHandler {
    private Object target;

    public LogHandler(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("开始执行方法：" + method.getName());
        Object invoke = method.invoke(target, args);
        System.out.println("方法执行结束");
        return invoke;
    }
}
