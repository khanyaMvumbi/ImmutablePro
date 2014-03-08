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
public class AnimalStatus {
    
    private String statusID;
    private String statusMessage;
    private Date date;

    public static class Builder{
        private String statusID;
        private String statusMessage;
        private Date date;
        
        public Builder(String statusID)
        {
            this.statusID = statusID;
        }
        
        public Builder statusMessage(String mesg)
        {
            this.statusMessage = mesg;
            return this;            
        }
        
        public Builder date(Date date){
            this.date = date;
            return this;
        }
        
        public Builder status(AnimalStatus status)
        {
            date = status.getDate();
            statusID = status.getStatusID();
            statusMessage = status.getStatusMessage();
            return this;
        }
        
        public AnimalStatus build()
        {
           return new AnimalStatus(this);
        }
    }
    
    public AnimalStatus(Builder build) {
        this.statusID = build.statusID;
        this.statusMessage = build.statusMessage;
        this.date = build.date;
    }

    public String getStatusID() {
        return statusID;
    }
    
    public String getStatusMessage() {
        return statusMessage;
    }

    public Date getDate() {
        return date;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 53 * hash + (this.statusID != null ? this.statusID.hashCode() : 0);
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
        final AnimalStatus other = (AnimalStatus) obj;
        if ((this.statusID == null) ? (other.statusID != null) : !this.statusID.equals(other.statusID)) {
            return false;
        }
        return true;
    }
    
    
    
    
    
    
}
