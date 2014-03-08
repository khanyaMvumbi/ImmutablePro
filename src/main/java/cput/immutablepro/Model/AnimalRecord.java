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
public class AnimalRecord {
    
    private String record;
    private List<Animal> animal;
    
    private AnimalRecord(AnimalRecordBuilder build)
    {
        this.record = build.record;
        this.animal = build.animal;
    }
    
    public static class AnimalRecordBuilder {
        
        private String record;
        private List<Animal> animal;

        public AnimalRecordBuilder()
        {
            
        }
        
        public AnimalRecordBuilder(String record) {
            this.record = record;            
        }
        public AnimalRecordBuilder Animal(List<Animal> animal) {
            this.animal = animal;
            return this;
        }                
        
    }
    public String getRecord() {
        return record;
    }

    public List<Animal> getAnimal() {
        return animal;
    }
    
    
   
    
    
    
}
