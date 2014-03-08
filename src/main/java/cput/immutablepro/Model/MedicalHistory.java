/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cput.immutablepro.Model;

/**
 *
 * @author Khanya
 */
public class MedicalHistory {
    
    private String medID;
    private String description;
    private String history;

    public MedicalHistory(Builder build) {
        this.medID = build.medID;
        this.description = build.description;
        this.history = build.history;
        
    }
    
public static class Builder{
    private String medID;
    private String description;
    private String history;

        public void setMedID(String medID) {
            this.medID = medID;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public void setHistory(String history) {
            this.history = history;
        }
        
        public Builder medicalHistory(MedicalHistory hist)
        {
             description = hist.getDescription();
             history = hist.getHistory();
             medID = hist.getMedID();
             return this;
        }
        public MedicalHistory build()
        {
            return new MedicalHistory(this);
        }      
    
}
    
    
    public String getMedID() {
        return medID;
    }

    public String getDescription() {
        return description;
    }

    public String getHistory() {
        return history;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + (this.medID != null ? this.medID.hashCode() : 0);
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
        final MedicalHistory other = (MedicalHistory) obj;
        if ((this.medID == null) ? (other.medID != null) : !this.medID.equals(other.medID)) {
            return false;
        }
        return true;
    }
    
    
    
   
    
}
