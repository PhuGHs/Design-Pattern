package creational_dp.prototype.bt_prototype;

import java.util.HashMap;
import java.util.Map;

public class ProgrammeRegistry {
    private final Map<String, Programme> registry;

    public ProgrammeRegistry() {
        registry = new HashMap<>();
    }

    public void registryProgramme(EntertainmentType type, Programme programme) {
        registry.put(type.getType(), programme);
    }

    public Programme createProgramme(EntertainmentType type) {
        Programme prototype = registry.get(type.getType());
        return prototype != null ? prototype.clone() : null;
    }
}
