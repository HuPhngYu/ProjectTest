package entities;

import entities.Variant;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.0.v20130507-rNA", date="2018-03-23T18:20:09")
@StaticMetamodel(VariantGroup.class)
public class VariantGroup_ { 

    public static volatile SingularAttribute<VariantGroup, String> variantGroupName;
    public static volatile CollectionAttribute<VariantGroup, Variant> variantCollection;
    public static volatile SingularAttribute<VariantGroup, Integer> variantGroupID;

}