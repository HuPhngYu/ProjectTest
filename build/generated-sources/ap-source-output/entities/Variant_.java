package entities;

import entities.Product;
import entities.VariantGroup;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.0.v20130507-rNA", date="2018-03-23T18:20:09")
@StaticMetamodel(Variant.class)
public class Variant_ { 

    public static volatile CollectionAttribute<Variant, Product> productCollection;
    public static volatile SingularAttribute<Variant, VariantGroup> variantGroupID;
    public static volatile SingularAttribute<Variant, String> variantValue;
    public static volatile SingularAttribute<Variant, Integer> variantID;

}