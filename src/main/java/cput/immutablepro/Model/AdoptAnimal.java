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
public class AdoptAnimal {
    private String custNumber;
    private String empID;
    private List<Animal> animal;

    private AdoptAnimal(Builder build) {
        this.animal = build.animal;
        this.empID = build.empID;
        this.custNumber = build.custNumber;
     }

    
    
    public static class Builder{
        private String custNumber;
        private String empID;
        private List<Animal> animal;

        public Builder(String custNumber) {
            this.custNumber = custNumber;
        }

        public Builder EmpID(String empID) {
            this.empID = empID;
            return this;
        }

        public Builder Animal(List<Animal> animal) {
            this.animal = animal;
            return this;
        }
        
        public Builder adoptAnimal(AdoptAnimal adopt)
        {
            animal = adopt.getAnimal();
            custNumber = adopt.getCustNumber();
            empID = adopt.getEmpID();
            return this;
        }
        
        public AdoptAnimal build()
        {
            return new AdoptAnimal(this);
            
        }
                
    }
    
    
    public String getCustNumber() {
        return custNumber;
    }

    public String getEmpID() {
        return empID;
    }

    public List<Animal> getAnimal() {
        return animal;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 31 * hash + (this.custNumber != null ? this.custNumber.hashCode() : 0);
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
        final AdoptAnimal other = (AdoptAnimal) obj;
        if ((this.custNumber == null) ? (other.custNumber != null) : !this.custNumber.equals(other.custNumber)) {
            return false;
        }
        return true;
    }
    
    
}
