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
public class Animal {
    private String name;
    private String OwnerID;
    private int age;
    private String id;
    private String species;
    private String color;
    private String habitatID;
    private List<AnimalStatus> status; 
    private boolean adopted;
    
    private Animal()
    {
        
    }
    
    public static class Builder
   {       
    private String name;
    private String OwnerID;
    private int age;
    private String id;
    private String species;
    private String color;
    private List<AnimalStatus> status; 
    private boolean adopted;
       
        public Builder(String id)
        {           
            this.id = id;
        }
        public Builder Name(String name) {
            this.name = name;
            return this;
        }

        public Builder Owner(String Owner) {
            this.OwnerID = Owner;
           return this;
        }
        
        public Builder Species(String species) {
            this.species = species;
            return this;
        }

        public Builder Color(String color) {
            this.color = color;
            return this;
        }
        public Builder adopted(boolean adopt)
        {
            this.adopted = adopt;
            return this;
        }
        public Builder status(List<AnimalStatus> status)
        {
            this.status = status;
            return this;
        }
        
        public Builder animal(Animal animal)
        {
            OwnerID = animal.getOwnerID();
            name = animal.getName();
            species = animal.getSpecies();
            color = animal.getColor();
            id = animal.getId();
            age = animal.getAge();
            adopted = animal.adopted;
            return this;
       
        }
        public Animal build()
        {
            return new Animal(this);
        }    
       
   }   
   private Animal(Builder build)
   {
       this.id = build.id;
       this.OwnerID = build.OwnerID;
       this.color = build.color;
       this.name = build.name;
       this.species = build.species;
       this.age = build.age;
       this.status = build.status;
       this.adopted = build.adopted;
       }    

    /**
     * @return the name
     */
   
    
    public String getName() {
        return name;
    }

    public boolean isAdopted() {
        return adopted;
    }

    public String getOwnerID() {
        return OwnerID;
    }

    public String getHabitatID() {
        return habitatID;
    }

    public List<AnimalStatus> getStatus() {
        return status;
    }
    /**
     * @return the age
     */
    public int getAge() {
        return age;
    }

    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @return the species
     */
    public String getSpecies() {
        return species;
    }

    /**
     * @return the color
     */
    public String getColor() {
        return color;
    }

    @Override
    public int hashCode() {        
        return id.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Animal other = (Animal) obj;
        if ((this.id == null) ? (other.id != null) : !this.id.equals(other.id)) {
            return false;
        }
        return true;
    }
    
    
    
   
   
   
   

   
   }
