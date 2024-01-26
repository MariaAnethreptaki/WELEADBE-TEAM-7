package gr.athtech.domain;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serial;
import java.io.Serializable;

/**
 * Serialization in Java allows us to convert an Object to stream that we can send over the network or save it as file or store in DB for later usage.
 */
@Getter
@Setter
@ToString
@MappedSuperclass
public class BaseModel implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "idGenerator")
    @Column(updatable = false)
    private Long id;
}
