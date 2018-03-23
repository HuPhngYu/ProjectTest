/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;

/**
 *
 * @author NATSAMA
 */
@Embeddable
public class ReviewPK implements Serializable {
    @Basic(optional = false)
    @NotNull
    @Column(name = "ProductID", nullable = false)
    private int productID;
    @Basic(optional = false)
    @NotNull
    @Column(name = "CustomerID", nullable = false)
    private int customerID;

    public ReviewPK() {
    }

    public ReviewPK(int productID, int customerID) {
        this.productID = productID;
        this.customerID = customerID;
    }

    public int getProductID() {
        return productID;
    }

    public void setProductID(int productID) {
        this.productID = productID;
    }

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) productID;
        hash += (int) customerID;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ReviewPK)) {
            return false;
        }
        ReviewPK other = (ReviewPK) object;
        if (this.productID != other.productID) {
            return false;
        }
        if (this.customerID != other.customerID) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.ReviewPK[ productID=" + productID + ", customerID=" + customerID + " ]";
    }
    
}
