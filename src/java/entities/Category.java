/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package entities;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author NATSAMA
 */
@Entity
@Table(name = "Category", catalog = "ProjectTest", schema = "dbo", uniqueConstraints = {
    @UniqueConstraint(columnNames = {"CategoryName"})})
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Category.findAll", query = "SELECT c FROM Category c"),
    @NamedQuery(name = "Category.findByCategoryID", query = "SELECT c FROM Category c WHERE c.categoryID = :categoryID"),
    @NamedQuery(name = "Category.findByCategoryName", query = "SELECT c FROM Category c WHERE c.categoryName = :categoryName")})
public class Category implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "CategoryID", nullable = false)
    private Integer categoryID;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "CategoryName", nullable = false, length = 100)
    private String categoryName;
    @JoinTable(name = "ProductCategory", joinColumns = {
        @JoinColumn(name = "CategoryID", referencedColumnName = "CategoryID", nullable = false)}, inverseJoinColumns = {
        @JoinColumn(name = "ProductID", referencedColumnName = "ProductID", nullable = false)})
    @ManyToMany
    private Collection<Product> productCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "parentID", fetch = FetchType.LAZY, orphanRemoval = true)
    private Collection<Category> categoryCollection;
    @JoinColumn(name = "ParentID", referencedColumnName = "CategoryID")
    @ManyToOne
    private Category parentID;

    public Category() {
    }

    public Category(Integer categoryID) {
        this.categoryID = categoryID;
    }

    public Category(String categoryName, Category parentID) {
        this.categoryName = categoryName;
        this.parentID = parentID;
    }

    public Integer getCategoryID() {
        return categoryID;
    }

    public void setCategoryID(Integer categoryID) {
        this.categoryID = categoryID;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    @XmlTransient
    public Collection<Product> getProductCollection() {
        return productCollection;
    }

    public void setProductCollection(Collection<Product> productCollection) {
        this.productCollection = productCollection;
    }

    @XmlTransient
    public Collection<Category> getCategoryCollection() {
        return categoryCollection;
    }

    public void setCategoryCollection(Collection<Category> categoryCollection) {
        this.categoryCollection = categoryCollection;
    }

    public Category getParentID() {
        return parentID;
    }

    public void setParentID(Category parentID) {
        this.parentID = parentID;
    }
    
    // Thêm vào để xử lý quan hệ One To Many
    public void addChildToParent(Category child) {
        child.setParentID(this);
        this.categoryCollection.add(child);
    }
    
    public void removeChildFromParent(Category child) {
        this.categoryCollection.remove(child);
        if (child != null) {
            child.setParentID(null);
        }
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (categoryID != null ? categoryID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Category)) {
            return false;
        }
        Category other = (Category) object;
        if ((this.categoryID == null && other.categoryID != null) || (this.categoryID != null && !this.categoryID.equals(other.categoryID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Category[ categoryID=" + categoryID + " ]";
    }
    
}
