package clarity.match;

import clarity.model.DTClass;
import clarity.model.Entity;
import clarity.model.Handle;
import clarity.model.PVS;

public class EntityCollection {

    private final Entity[] entities = new Entity[1 << Handle.INDEX_BITS];

    public void add(int index, int serial, DTClass dtClass, PVS pvs, Object[] state) {
        entities[index] = new Entity(index, serial, dtClass, pvs, state);
    }

    public Entity getByIndex(int index) {
        return entities[index];
    }
    
    public Entity getByHandle(int handle) {
        Entity e = entities[Handle.indexForHandle(handle)];
        return e == null || e.getSerial() != Handle.serialForHandle(handle) ? null : e;
    }
    
    public void remove(int index) {
        entities[index] = null;
    }

}
