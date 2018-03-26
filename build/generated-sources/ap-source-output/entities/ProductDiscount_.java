package entities;

import entities.Product;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.0.v20130507-rNA", date="2018-03-26T18:41:34")
@StaticMetamodel(ProductDiscount.class)
public class ProductDiscount_ { 

    public static volatile SingularAttribute<ProductDiscount, String> discountName;
    public static volatile SingularAttribute<ProductDiscount, Date> dateCreated;
    public static volatile CollectionAttribute<ProductDiscount, Product> productCollection;
    public static volatile SingularAttribute<ProductDiscount, Date> validFrom;
    public static volatile SingularAttribute<ProductDiscount, Integer> discountID;
    public static volatile SingularAttribute<ProductDiscount, Integer> discountValue;
    public static volatile SingularAttribute<ProductDiscount, Date> dateUpdated;
    public static volatile SingularAttribute<ProductDiscount, Date> validTo;

}