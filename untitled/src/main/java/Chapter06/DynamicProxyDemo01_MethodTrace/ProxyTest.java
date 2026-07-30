package Chapter06.DynamicProxyDemo01_MethodTrace;

import java.lang.reflect.Proxy;

public class ProxyTest {
    public static void main(String[] args) {
        UserService userService = new UserServiceImpl();
        LogHandler handler = new LogHandler(userService);
        UserService proxyService = (UserService)Proxy.newProxyInstance(UserServiceImpl.class.getClassLoader(),new Class[]{UserService.class},handler);
        proxyService.addUser("Tom");


        userService.addUser("jack");
    }
}
