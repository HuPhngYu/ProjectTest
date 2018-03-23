package entities;

import entities.BookmarkPK;
import entities.Customer;
import entities.Product;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.0.v20130507-rNA", date="2018-03-23T18:20:09")
@StaticMetamodel(Bookmark.class)
public class Bookmark_ { 

    public static volatile SingularAttribute<Bookmark, BookmarkPK> bookmarkPK;
    public static volatile SingularAttribute<Bookmark, Product> product;
    public static volatile SingularAttribute<Bookmark, Date> dateCreated;
    public static volatile SingularAttribute<Bookmark, Customer> customer;

}