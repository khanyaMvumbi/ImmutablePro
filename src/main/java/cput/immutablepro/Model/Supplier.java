/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cput.immutablepro.Model;

import java.util.List;

/**
 *
 * @author Khanya
 */
public class Supplier {
    
    private String name;
    private String ID;
    private String companyName;
    private String supplyingType;

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 89 * hash + (this.ID != null ? this.ID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Supplier other = (Supplier) obj;
        if ((this.ID == null) ? (other.ID != null) : !this.ID.equals(other.ID)) {
            return false;
        }
        return true;
    }

    
    
    public String getName() {
        return name;
    }

    public String getID() {
        return ID;
    }

    public String getCompanyName() {
        return companyName;
    }

    public String getSupplyingType() {
        return supplyingType;
    }
    
    
   
}
