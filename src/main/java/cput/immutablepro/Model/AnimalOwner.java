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
public class AnimalOwner {
    
    private String OwnerID;
    private String name;
    public String surname;
    private int age;
    private String petsID;
    private List<Animal> animal;
    
    private AnimalOwner()
    {
        
    }
    
    private AnimalOwner(OwnerBuilder build)
    {
        this.OwnerID = build.OwnerID;
        this.age = build.age;
        this.name = build.name;
        this.petsID = build.petsID;
        this.surname = build.surname;
        this.animal = build.animal;
    }
    public static class OwnerBuilder{
        private String OwnerID;
        private String name;
        public String surname;
        private int age;
        private String petsID;
        private List<Animal> animal;
                
        public OwnerBuilder(String OwnerID)
        {
            this.OwnerID = OwnerID;
        }        
        public OwnerBuilder Name(String name) {
            this.name = name;
            return this;
        }
        public OwnerBuilder Surname(String surname) {
            this.surname = surname;
            return this;
        }
        public OwnerBuilder Age(int age) {
            this.age = age;
            return this;
        }

        public OwnerBuilder PetsID(String petsID) {
            this.petsID = petsID;
            return this;
        }

       public OwnerBuilder Animal(List<Animal> animal) {
           this.animal = animal;
          return this;
        }
        public AnimalOwner build()
        {
            return new AnimalOwner();
        }   
        
    }

    public String getOwnerID() {
        return OwnerID;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public String getPetsID() {
        return petsID;
    }

    public List<Animal> getAnimal() {
        return animal;
    }

    @Override
    public int hashCode(){
        return OwnerID.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final AnimalOwner other = (AnimalOwner) obj;
        if ((this.OwnerID == null) ? (other.OwnerID != null) : !this.OwnerID.equals(other.OwnerID)) {
            return false;
        }
        return true;
    }
    
    
    
    
    
    
    
    
}
