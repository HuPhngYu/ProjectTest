package entities;

import entities.Product;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.0.v20130507-rNA", date="2018-03-26T18:41:34")
@StaticMetamodel(ProductImage.class)
public class ProductImage_ { 

    public static volatile SingularAttribute<ProductImage, String> imageLink;
    public static volatile SingularAttribute<ProductImage, Integer> imageID;
    public static volatile SingularAttribute<ProductImage, Product> productID;

}