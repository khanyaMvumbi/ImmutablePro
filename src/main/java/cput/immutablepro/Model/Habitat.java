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
public class Habitat {
    
    private String habitatID;
    private String block;
    private List<ServiceHabitat> serviceHabitat;
    
    private Habitat(Builder build)
    {
        habitatID =  build.habitatID;
        block = build.block;
    }
    
    
    
    public static class Builder{
        
    private String habitatID;
    private String block;
    private List<ServiceHabitat> serviceHabitat;
    
    public Builder(String id)
    {
        habitatID = id;
    }
    public Builder block(String block){
            this.block = block;
            return this;
    }
    
    public Builder habitat(Habitat habitat)
    {
        block = habitat.getBlock();
        habitatID = habitat.getHabitatID();
        return this;
    }
    
    public Habitat build(){
        
        return new Habitat(this);
    }
    }

    public String getHabitatID() {
        return habitatID;
    }

    public String getBlock() {
        return block;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 17 * hash + (this.habitatID != null ? this.habitatID.hashCode() : 0);
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
        final Habitat other = (Habitat) obj;
        if ((this.habitatID == null) ? (other.habitatID != null) : !this.habitatID.equals(other.habitatID)) {
            return false;
        }
        return true;
    }
    
    
    
}
