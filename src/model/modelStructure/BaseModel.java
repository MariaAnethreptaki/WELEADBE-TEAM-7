package src.model.modelStructure;

import java.io.Serializable;

/**
 * Serialization in Java allows us to convert an Object to stream that we can send over the network or save it as file or store in DB for later usage.
 */
public class BaseModel implements Serializable {
        private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "BaseModel{" +
                "id=" + id +
                '}';
    }
}
