package Chapter06.DynamicProxyDemo01_MethodTrace;

public class UserServiceImpl implements UserService{
    @Override
    public void addUser(String username) {
        System.out.println("添加用户：" + username);
    }
}
