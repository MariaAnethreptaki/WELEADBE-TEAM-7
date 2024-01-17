package gr.athtech.domain;

import lombok.Getter;

import java.io.Serializable;

/**
 * Serialization in Java allows us to convert an Object to stream that we can send over the network or save it as file or store in DB for later usage.
 */
@Getter
public class BaseModel implements Serializable {
        private Long id;

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
