package gr.athtech.domain;

import gr.athtech.passwordHandler.ValidPassword;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.*;

import java.util.HashSet;
import java.util.Set;

/**
 * This class handles the private information of every user.
 */
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString(callSuper = true)
@Entity
@Table(name = "ACCOUNTS", indexes = {@Index(columnList = "email")})
@SequenceGenerator(name = "idGenerator", sequenceName = "ACCOUNTS_SEQ", initialValue = 1, allocationSize = 1)
public class Account extends BaseModel {
    /*attributes*/
    @NotNull(message = "Last name cannot be null")
    @Column(length = 30, nullable = false)
    private String surname;

    @NotNull(message = "First name cannot be null")
    @Column(length = 20, nullable = false)
    private String name;

    @NotNull(message = "Email address cannot be null")
    @Email
    @Column(length = 50, nullable = false, unique = true)
    private String email;

    //@ValidPassword
    @Size(min=8, message = "Password should be more than 8 characters")
    private String password;

    @Size(min=9)
    @Column(length = 50, nullable = false,  unique = true)
    private String phoneNumber;

    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    @OneToMany(mappedBy = "account", fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = true)
    @Builder.Default
    private Set<ShippingAddress> shippingAddresses= new HashSet<>();

}