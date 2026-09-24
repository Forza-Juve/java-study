package Chapter09.FixedSettingsDemo;

import java.util.List;
import java.util.Map;

public class FixedSettingsTest {
    public static void main(String[] args) {
        //测试1：默认角色
        FixedSettings fs = new FixedSettings();
        List<String> defaultRoles = fs.getDefaultRoles();
        System.out.println(defaultRoles);
        //测试2：默认角色不可修改
        //defaultRoles.add("Test");
        //UnsupportedOperationException
        //测试3：默认权限不可修改
        Map<String, Integer> defaultPermissions = fs.getDefaultPermissions();
        //defaultPermissions.put("Test",5);
        //UnsupportedOperationException
        //测试4：创建可修改角色列表
        List<String> editableRoles = fs.createEditableRoles();
        editableRoles.add("AUDITOR");
        System.out.println(editableRoles);
        //测试5：独立性
        System.out.println(defaultRoles);
    }
}
