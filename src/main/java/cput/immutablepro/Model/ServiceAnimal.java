/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cput.immutablepro.Model;

import java.util.Date;
import java.util.List;

/**
 *
 * @author Khanya
 */
public class ServiceAnimal {
    
    private String ID;
    private Date date; 
    private List<Animal> animal;

    private ServiceAnimal(Builder build)
    {
        ID = build.ID;
        date = build.date;
        animal = build.animal;
    }
    
    public static class Builder{
        private String ID;
        private Date date; 
        private List<Animal> animal;

        public Builder(String ID) {
            this.ID = ID;
            
        }

        public Builder Date(Date date) {
            this.date = date;
            return this;
        }

        public Builder animal(List<Animal> animal) {
            this.animal = animal;
            return this;
        }    
        
        public Builder serviceAnimal(ServiceAnimal service)
        {
            ID = service.getID();
            date = service.getDate();
            animal = service.getAnimal();
            return this;
        }
        
        public ServiceAnimal build()
        {
            return new ServiceAnimal(this);            
        }
        
        
                
    }
    public String getID() {
        return ID;
    }

    public Date getDate() {
        return date;
    }

    public List<Animal> getAnimal() {
        return animal;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + (this.ID != null ? this.ID.hashCode() : 0);
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
        final ServiceAnimal other = (ServiceAnimal) obj;
        if ((this.ID == null) ? (other.ID != null) : !this.ID.equals(other.ID)) {
            return false;
        }
        return true;
    }
    
    
    
    
}
