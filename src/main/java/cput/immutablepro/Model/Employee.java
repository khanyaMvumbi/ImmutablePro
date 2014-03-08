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
public class Employee {
    
    private String empID;
    private String empName;
    private String empSurname;
    private String jobType;
    private List<FeedAnimal> feedAnimal;
    private List<TransportAnimal> transportAnimal;
    private List<AdoptAnimal> purchase;
    private List<ServiceHabitat> serviceHabitat;
    private List<ServiceAnimal> serviceAnimal;

    private Employee(EmployeeBuilder build)
    {
        this.empID = build.empID;
        this.empName = build.empName;
        this.empSurname = build.empSurname;
        this.jobType = build.jobType;
        this.transportAnimal = build.transportAnimal;
        this.feedAnimal = build.feedAnimal;
        this.serviceAnimal = build.serviceAnimal;
        this.serviceHabitat = build.serviceHabitat;
        this.purchase = build.purchase;
    }   
    
    public static class EmployeeBuilder{
        
    private String empID;
    private String empName;
    private String empSurname;
    private String jobType;
    private List<FeedAnimal> feedAnimal;
    private List<TransportAnimal> transportAnimal;
    private List<ServiceHabitat> serviceHabitat;
    private List<ServiceAnimal> serviceAnimal;
    private List<AdoptAnimal> purchase;
    
    
    
        public EmployeeBuilder(String empID)
        {
            this.empID = empID;
        }
        
        public EmployeeBuilder EmpID(String empID) {
            this.empID = empID;
            return this;
        }
        
        public EmployeeBuilder EmpName(String empName) {
            this.empName = empName;
            return this;
        }
        
        public EmployeeBuilder EmpSurname(String empSurname) {
            this.empSurname = empSurname;
            return this;
        }

        public EmployeeBuilder JobType(String jobType) {
            this.jobType = jobType;
            return this;
        }

        public EmployeeBuilder FeedAnimal(List<FeedAnimal> feedAnimal) {
            this.feedAnimal = feedAnimal;
            return this;
        }

        public EmployeeBuilder transportAnimal(List<TransportAnimal> transportAnimal) {
            this.transportAnimal = transportAnimal;
            return this;
        }

        public EmployeeBuilder ServiceHabitat(List<ServiceHabitat> serviceHabitat) {
            this.serviceHabitat = serviceHabitat;
            return this;
        }

        public EmployeeBuilder ServiceAnimal(List<ServiceAnimal> serviceAnimal) {
            this.serviceAnimal = serviceAnimal;
            return this;
        }

        public EmployeeBuilder Purchase(List<AdoptAnimal> purchase) {
            this.purchase = purchase;
            return this;
        }
        
        public EmployeeBuilder empBuild(Employee emp)
        {
            empName = emp.getEmpName();
            empID = emp.getEmpID();
            empSurname = emp.getEmpSurname();
            jobType = emp.getJobType();
            purchase = emp.getPurchase();
            serviceAnimal = emp.getServiceAnimal();
            transportAnimal = emp.getTransportAnimal();
            serviceHabitat = emp.getServiceHabitat();
            feedAnimal = emp.getFeedAnimal();
            
            return this;
        }
        public Employee build()
        {
            return new Employee(this);
        }   
    }
    public String getEmpID() {
        return empID;
    }

    public String getEmpName() {
        return empName;
    }

    public String getEmpSurname() {
        return empSurname;
    }

    public List<AdoptAnimal> getPurchase() {
        return purchase;
    }

    public List<ServiceHabitat> getServiceHabitat() {
        return serviceHabitat;
    }

    public List<ServiceAnimal> getServiceAnimal() {
        return serviceAnimal;
    }

    public String getJobType() {
        return jobType;
    }

    public List<FeedAnimal> getFeedAnimal() {
        return feedAnimal;
    }

    public List<cput.immutablepro.Model.TransportAnimal> getTransportAnimal() {
        return transportAnimal;
    }

    @Override
    public int hashCode() {
        return empID.hashCode();
        
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Employee other = (Employee) obj;
        if ((this.empID == null) ? (other.empID != null) : !this.empID.equals(other.empID)) {
            return false;
        }
        return true;
    }
    
    
    
    
    
}
