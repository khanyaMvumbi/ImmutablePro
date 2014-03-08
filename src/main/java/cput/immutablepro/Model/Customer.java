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
public class Customer {

private String custName;
private String custNumber;
private String custSurname;
private String animalID;
private List <AdoptAnimal> adopt;

private Customer(Builder build)
{
    adopt = build.adopt;
    custName = build.custName;
    custSurname = build.custSurname;
    custNumber = build.custNumber;
    animalID = build.animalID;
}


public static class Builder{
    private String custName;
    private String custNumber;
    private String custSurname;
    private String animalID;
    private List <AdoptAnimal> adopt;

        public Builder CustName(String custName) {
            this.custName = custName;
            return this;
        }

        public Builder (String custNumber) {
            this.custNumber = custNumber;
            
        }

        public Builder CustSurname(String custSurname) {
            this.custSurname = custSurname;
            return this;
        }

        public Builder AnimalID(String animalID) {
            this.animalID = animalID;
            return this;
            
        }

        public Builder Adopt(List<AdoptAnimal> adopt) {
            this.adopt = adopt;
            return this;
        }      
        
        public Builder customer(Customer cust)
        {
            adopt = cust.getAdopt();
            animalID = cust.getAnimalID();
            custName = cust.getCustName();
            custNumber = cust.getCustNumber();
            custSurname = cust.getCustSurname();
            return this;
        }
        
        public Customer build()
        {
            return new Customer(this);
        }
}
    public String getCustName() {
        return custName;
    }

    public String getCustNumber() {
        return custNumber;
    }

    public String getCustSurname() {
        return custSurname;
    }

    public String getAnimalID() {
        return animalID;
    }

    public List<AdoptAnimal> getAdopt() {
        return adopt;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 23 * hash + (this.custName != null ? this.custName.hashCode() : 0);
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
        final Customer other = (Customer) obj;
        if ((this.custName == null) ? (other.custName != null) : !this.custName.equals(other.custName)) {
            return false;
        }
        return true;
    }






    
}
