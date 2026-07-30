package Chapter06.DynamicProxyDemo02_PermissionCheck;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class PermissionHandler implements InvocationHandler {
    private Object target;
    private boolean admin;

    public PermissionHandler(Object target, boolean admin) {
        this.target = target;
        this.admin = admin;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        String methodName = method.getName();
        if("deleteUser".equals(methodName)){
           if(admin){
               System.out.println("权限验证通过");
               return method.invoke(target,args);
           }else {
               System.out.println("权限不足，禁止删除用户");
           }
        }else{
            return method.invoke(target,args);
        }
        return null;
    }
}
