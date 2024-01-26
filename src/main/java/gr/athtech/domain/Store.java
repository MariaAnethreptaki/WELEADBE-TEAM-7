package gr.athtech.domain;

import jakarta.persistence.*;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

// this class contains the information about the stores//
@Getter
@Setter
@Builder
@ToString(callSuper = true)
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "STORES")
@SequenceGenerator(name = "idGenerator", sequenceName = "STORES_SEQ", initialValue = 1, allocationSize = 1)

public class Store extends BaseModel {
    @NotNull
    @Column(length = 50, nullable = false)
    private String storeName;

    @NotNull
    @Column(length = 50, nullable = false)
    private String storeLocation;

    @NotNull
    @Min(1)
    @Max(5)
    private double rate;

    @NotNull(message = "CLOSED")
    @Column(length = 11, nullable = false)
    private boolean status;

    @NotNull
    @Column(length = 50, nullable = false)
    private String storeCategory;

    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    @OneToMany(mappedBy = "menu", fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = true)
    @Builder.Default
    private Set<Product> menu = new HashSet<>();

    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    @OneToMany(mappedBy = "Store", fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = true)
    @Builder.Default
    private Set<Store> famousStores = new HashSet<>();

}

