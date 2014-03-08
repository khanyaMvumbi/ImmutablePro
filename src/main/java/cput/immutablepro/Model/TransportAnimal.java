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
public class TransportAnimal{
    
    private String transportNumber;
    private List<Animal> animals;
    private String address;
    
    
    private TransportAnimal(Builder build)
    {
        transportNumber =  build.address;
        animals = build.animals;
        address = build.transportNumber;
    }
    public static class Builder{
        
        private String transportNumber;
    private List<Animal> animals;
    private String address;
        
        public Builder(String transport)
        {
            this.transportNumber = transport ;
        }
        public Builder address(String address) {
            this.address = address;
            return this;
        }

        public Builder animals(List<Animal> animals) {
            this.animals = animals;
            return this;
        }
        
        public Builder transportAnimal(TransportAnimal trans)
        {
            address = trans.getAddress();
            animals = trans.getAnimals();
            transportNumber = trans.getTransportNumber();
            
            return this;
        }
        
        public TransportAnimal build()
        {
           return new TransportAnimal(this);
        }
    }

    public String getAddress() {
        return address;
    }   
    
    public String getTransportNumber() {
        return transportNumber;
    }
    
    public List<Animal> getAnimals() {
        return animals;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + (this.transportNumber != null ? this.transportNumber.hashCode() : 0);
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
        final TransportAnimal other = (TransportAnimal) obj;
        if ((this.transportNumber == null) ? (other.transportNumber != null) : !this.transportNumber.equals(other.transportNumber)) {
            return false;
        }
        return true;
    }
    
    
}
