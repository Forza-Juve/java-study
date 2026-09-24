package Chapter09.FixedSettingsDemo;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class FixedSettings {
    private final List<String> defaultRoles = List.of("ADMIN","USER","GUEST");
    private final Map<String,Integer> defaultPermissions = Map.ofEntries(
            Map.entry("READ" , 1),
            Map.entry("WRITE" , 2),
            Map.entry("DELETE" , 3)
    );

    public List<String> getDefaultRoles(){
        return defaultRoles;
    }

    public Map<String, Integer> getDefaultPermissions(){
        return defaultPermissions;
    }

    public List<String> createEditableRoles(){
        return new ArrayList<>(defaultRoles);
    }
}
