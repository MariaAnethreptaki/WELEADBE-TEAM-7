package gr.athtech.domain;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString(callSuper = true)
@Entity
@Table(name = "PRODUCTS")
@SequenceGenerator(name = "idGenerator", sequenceName = "PRODUCTS_SEQ", initialValue = 1, allocationSize = 1)

public class Product extends BaseModel {
    @NotNull
    @Column(length = 30, nullable = false, unique = true)
    public String serialNumber;

    @NotNull
    @Column(length = 50, nullable = false)
    private String productName;

    @Column(length = 50)
    private String description;

    @NotNull
    @Column(precision = 10, scale = 2, nullable = false)
    private BigDecimal price;

    @NotNull(message = "Cannot be null, customer's should know the availability of the products")
    @Column(length = 11, nullable = false)
    private boolean available;

    @NotNull
    @ManyToOne(fetch = FetchType.EAGER)
    private ProductCategory category;

}
