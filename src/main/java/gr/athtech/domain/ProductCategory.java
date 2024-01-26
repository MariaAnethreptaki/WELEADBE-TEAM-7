package gr.athtech.domain;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@Builder
@ToString(callSuper = true)
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "PRODUCT_CATEGORIES")
@SequenceGenerator(name = "idGenerator", sequenceName = "PRODUCT_CATEGORIES_SEQ", initialValue = 1, allocationSize = 1)
public class ProductCategory extends BaseModel{
    @NotNull
    @Column(length = 50, nullable = false)
   private String productCategoryName;

    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    @OneToMany(mappedBy = "products", fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = true)
    @Builder.Default
   private Set<Product> products=new HashSet<>();

}
