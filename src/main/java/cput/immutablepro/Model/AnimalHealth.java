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
public class AnimalHealth {
      
     private String healthID;
     private String condition;
     private String description;
     private List<Animal> animal;
     private List<Treatment> treatment; 
     private List<MedicalHistory> history;
     
     private AnimalHealth()
     {
     }
     
     private AnimalHealth(AnimalHealthBuilder builder)
     {
         this.animal = builder.animal;
         this.condition = builder.condition;
         this.description = builder.description;
         this.healthID = builder.healthID;
         this.treatment = builder.treatment;
         
         
     }
     
     public static class AnimalHealthBuilder
     {
         private String condition;
         private String description;
         private List<Animal> animal;
         private List<Treatment> treatment; 
         private String healthID;
         private List<MedicalHistory> history;
         
         public AnimalHealthBuilder(String healthID)
         {
             this.healthID = healthID;
         }
        public AnimalHealthBuilder Condition(String condition) {
            this.condition = condition;
            return this;
        }

        public AnimalHealthBuilder Description(String description) {
            this.description = description;
            return this;
        }
        public AnimalHealthBuilder animals(List<Animal> animals)
        {
            this.animal = animals;
            return this;
        }
        
        public AnimalHealthBuilder history(List<MedicalHistory> history)
        {
            this.history = history;
            return this;
                        
        }
        
        public AnimalHealthBuilder animalHealth(AnimalHealth health)
        {
            animal = health.getAnimal();
            treatment = health.getTreatment();
            condition = health.getCondition();
            healthID = health.getHealthID();
            description =  health.getDescription();
            return this;
        }
              
        public AnimalHealth build()
        {
            return new AnimalHealth(this);
        }
             
     }
     public String getCondition() {
        return condition;
    }

    public String getDescription() {
        return description;
    }    

    public String getHealthID() {
        return healthID;
    }

    public List<Animal> getAnimal() {
        return animal;
    }

    public List<MedicalHistory> getHistory() {
        return history;
    }

    public List<Treatment> getTreatment() {
        return treatment;
    }
     
}
