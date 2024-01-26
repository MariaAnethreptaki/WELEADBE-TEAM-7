package gr.athtech.domain;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Getter
@Setter
@Builder
@ToString(callSuper = true)
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "STORE_CATEGORIES")
@SequenceGenerator(name = "idGenerator", sequenceName = "STORE_CATEGORIES_SEQ", initialValue = 1, allocationSize = 1)

public class StoreCategory extends BaseModel{
    @NotNull
    @Column(length = 50, nullable = false)
    private String nameCategory;

    @NotNull
    @Column(length = 50, nullable = false)
    private String description;

    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    @OneToMany(mappedBy = "store", fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = true)
    @Builder.Default
    private Set<Store> stores = new HashSet<>();

    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    @OneToMany(mappedBy = "store", fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = true)
    @Builder.Default
    private Set<Store> famousStoresCategory = new HashSet<>();


}
