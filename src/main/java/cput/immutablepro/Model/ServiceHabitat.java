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
public class ServiceHabitat {
    
    private String serviceNO;
    private boolean clean;

    private ServiceHabitat(Builder build) {
        this.serviceNO = build.serviceNO;
        this.clean = build.clean;
    }
    
    public static class Builder{
        private String serviceNO;
        private boolean clean;

        public Builder (String serviceNO) {
            this.serviceNO = serviceNO;
            
        }

        public Builder Isclean(boolean isclean) {
            this.clean = isclean;
            return this;
        }
        
        public Builder serviceHabitat(ServiceHabitat habitat)
        {
            this.clean = habitat.isClean();
            this.serviceNO = habitat.getServiceNO();
            return this;
        }
        
        public ServiceHabitat build()
        {
            return new ServiceHabitat(this);
        }
        
        
    }

    
    
    
    public String getServiceNO() {
        return serviceNO;
    }

    public boolean isClean() {
        return clean;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 47 * hash + (this.serviceNO != null ? this.serviceNO.hashCode() : 0);
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
        final ServiceHabitat other = (ServiceHabitat) obj;
        if ((this.serviceNO == null) ? (other.serviceNO != null) : !this.serviceNO.equals(other.serviceNO)) {
            return false;
        }
        return true;
    }
    
    
    
}
