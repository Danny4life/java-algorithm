package tutorial;

import java.io.Serializable;

public class SerializableEx implements Serializable {
    int id;
    String name;

    public SerializableEx(int id, String name) {
        this.id = id;
        this.name = name;
    }
}
