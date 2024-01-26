package gr.athtech.domain;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.*;
import gr.athtech.domain.enumPackage.PaymentInfo;
import gr.athtech.domain.enumPackage.StatusOfOrder;

import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/** This class handles the private information of every order.
* create OrderItem to generate the OrderId
*/
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString(callSuper = true)
@Entity
@Table(name = "ORDERS")
@SequenceGenerator(name = "idGenerator", sequenceName = "ORDERS_SEQ", initialValue = 1, allocationSize = 1)

public class Order extends BaseModel{
    /*attributes*/
    @ToString.Exclude
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    public Account customerId;

    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    @OneToMany(mappedBy = "order", fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = true)
    @Builder.Default
    public Set<Product> products= new HashSet<>();

    @Temporal(TemporalType.TIMESTAMP)
    @Column(nullable = false)
    public Date orderDate;

    @Enumerated(EnumType.STRING)
    @Column(length = 11, nullable = false)
    public StatusOfOrder status;

    @Enumerated(EnumType.STRING)
    @Column(length = 11, nullable = false)
    public PaymentInfo paymentInfo;

    @NotNull
    @Column(precision = 10, scale = 2, nullable = false)
    private BigDecimal cost;
}
