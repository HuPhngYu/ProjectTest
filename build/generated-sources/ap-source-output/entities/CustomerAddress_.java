package entities;

import entities.Customer;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.0.v20130507-rNA", date="2018-03-26T18:41:34")
@StaticMetamodel(CustomerAddress.class)
public class CustomerAddress_ { 

    public static volatile SingularAttribute<CustomerAddress, String> number;
    public static volatile SingularAttribute<CustomerAddress, String> city;
    public static volatile SingularAttribute<CustomerAddress, String> street;
    public static volatile SingularAttribute<CustomerAddress, String> district;
    public static volatile SingularAttribute<CustomerAddress, Customer> customerID;
    public static volatile SingularAttribute<CustomerAddress, String> ward;
    public static volatile SingularAttribute<CustomerAddress, Integer> addressID;

}