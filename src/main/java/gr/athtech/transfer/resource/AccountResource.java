package gr.athtech.transfer.resource;

import gr.athtech.domain.ShippingAddress;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Set;

@Getter
@Setter
@ToString(callSuper = true)
public class AccountResource extends BaseResource {
	private String surname;
	private String name;
	private String email;
	private String password;
	private String phoneNumber;
	private Set<ShippingAddress> shippingAddresses;

}
