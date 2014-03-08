/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cput.immutablepro.Model;

import java.util.Date;

/**
 *
 * @author Khanya
 */
public class Treatment {
    private String treatmentNO;
    private String description;
    private Date expiryDate;
    private String instructions;

    private Treatment(Builder build) {
        this.treatmentNO = build.treatmentNO;
        this.description = build.description;
        this.expiryDate = build.expiryDate;
        this.instructions = build.instructions;
    }

    public static class Builder{
        private String treatmentNO;
        private String description;
        private Date expiryDate;
        private String instructions;
        
        public Builder(String treatmentNO)
        {
               this.treatmentNO = treatmentNO;         
        }

        public Builder TreatmentNO(String treatmentNO) {
            this.treatmentNO = treatmentNO;
            return this;
        }

        public Builder Description(String description) {
            this.description = description;
            return this;
        }

        public Builder ExpiryDate(Date expiryDate) {
            this.expiryDate = expiryDate;
            return this;
        }

        public Builder Instructions(String instructions) {
            this.instructions = instructions;
            return this;
        }  
        
        public Builder treatment(Treatment treat)
        {
            description =  treat.getDescription();
            expiryDate =  treat.getExpiryDate();
            instructions = treat.getInstructions();
            treatmentNO =  treat.getTreatmentNO();
            return this;
        }
        
        public Treatment build()
        {
            return new Treatment(this);
        }
        
    }
    
    
    
    public String getTreatmentNO() {
        return treatmentNO;
    }

    public String getDescription() {
        return description;
    }

    public Date getExpiryDate() {
        return expiryDate;
    }

    public String getInstructions() {
        return instructions;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + (this.treatmentNO != null ? this.treatmentNO.hashCode() : 0);
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
        final Treatment other = (Treatment) obj;
        if ((this.treatmentNO == null) ? (other.treatmentNO != null) : !this.treatmentNO.equals(other.treatmentNO)) {
            return false;
        }
        return true;
    }
    
    
    
    
}
