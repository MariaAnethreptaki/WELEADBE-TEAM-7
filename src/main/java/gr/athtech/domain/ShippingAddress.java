package gr.athtech.domain;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.*;
import gr.athtech.domain.enumPackage.TypeAddress;

/**
 * this class includes attributes of a shipping address.
 */
@Getter
@Setter
@Builder
@ToString(callSuper = true)
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "SHIPPING_ADDRESS")
@SequenceGenerator(name = "idGenerator", sequenceName = "SHIPPING_ADDRESS_SEQ", initialValue = 1, allocationSize = 1)
public class ShippingAddress extends BaseModel{
    @NotNull
    @Column(length = 50, nullable = false)
    private String street;

    @NotNull
    @Column(length = 50, nullable = false)
    private String streetNumber;

    @NotNull
    @Column(length = 50, nullable = false)
    private String floor;

    @NotNull
    @Column(length = 50, nullable = false)
    private String bell;

    @NotNull
    @Column(length = 50, nullable = false)
    private String city;

    @NotNull
    @Column(length = 50, nullable = false)
    private String zipCode;

    @Column(length = 50, nullable = false)
    private String specificInstructions;

    @Enumerated(EnumType.STRING)
    @Column(length = 10, nullable = false)
    private TypeAddress typeAddress;

    @NotNull
    @Column(length = 50, nullable = false)
    private String communicationPhoneNumber;

}
