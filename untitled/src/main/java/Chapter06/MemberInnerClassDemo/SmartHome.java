package Chapter06.MemberInnerClassDemo;

public class SmartHome {
    private String homeName;
    private boolean securityEnabled;

    public SmartHome(String homeName, boolean securityEnabled) {
        this.homeName = homeName;
        this.securityEnabled = securityEnabled;
    }

    public void startSystem(){
        SecurityMonitor securityMonitor = new SecurityMonitor();
        securityMonitor.checkStatus();
    }

    class SecurityMonitor{
        public void checkStatus(){
            System.out.println("家庭名称："+ SmartHome.this.homeName +
                    "\n" +
                    "安防状态：" + SmartHome.this.securityEnabled);
        }
    }
}
