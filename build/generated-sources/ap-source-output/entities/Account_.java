package entities;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.0.v20130507-rNA", date="2018-03-23T18:20:09")
@StaticMetamodel(Account.class)
public class Account_ { 

    public static volatile SingularAttribute<Account, Integer> accountID;
    public static volatile SingularAttribute<Account, String> password;
    public static volatile SingularAttribute<Account, String> role;
    public static volatile SingularAttribute<Account, Date> dateCreated;
    public static volatile SingularAttribute<Account, String> phone;
    public static volatile SingularAttribute<Account, String> userName;
    public static volatile SingularAttribute<Account, String> email;
    public static volatile SingularAttribute<Account, Date> dateUpdated;

}