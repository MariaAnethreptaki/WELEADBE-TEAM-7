package gr.athtech.transfer.resource;

import gr.athtech.domain.Account;
import gr.athtech.domain.enumPackage.TypeAddress;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString(callSuper = true)
public class ShippingAddressResource extends BaseResource {
    private String street;
    private String streetNumber;
    private String floor;
    private String bell;
    private String city;
    private String zipCode;
    private String specificInstructions;
    private TypeAddress typeAddress;
    private String communicationPhoneNumber;
    private Account account;
}
