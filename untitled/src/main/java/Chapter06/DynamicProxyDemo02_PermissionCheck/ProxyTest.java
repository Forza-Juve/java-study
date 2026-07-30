package Chapter06.DynamicProxyDemo02_PermissionCheck;

import java.lang.reflect.Proxy;

public class ProxyTest {
    public static void main(String[] args) {
        UserService adminUser = new UserServiceImpl();
        PermissionHandler adminHandler = new PermissionHandler(adminUser,true);
        UserService proxy = (UserService) Proxy.newProxyInstance(UserService.class.getClassLoader(),new Class[]{UserService.class},adminHandler);
        proxy.addUser("Tom");
        proxy.deleteUser("Tom");

        UserService normalUser = new UserServiceImpl();
        PermissionHandler normalHandler = new PermissionHandler(normalUser,false);
        proxy = (UserService) Proxy.newProxyInstance(normalUser.getClass().getClassLoader(), new Class[]{UserService.class},normalHandler);
        proxy.deleteUser("Jerry");
        proxy.addUser("Lucy");
    }
}
