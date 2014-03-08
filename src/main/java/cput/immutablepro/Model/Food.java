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
public class Food {
    
    private String name;
    private String description;
    private int foodId;

    
    private Food(Builder build)
    {
        name = build.name;
        description = build.description;
        foodId = build.foodId;
    }
    
    public static class Builder{
        
        private String name;
        private String description;
        private int foodId;
        
        public Builder(int foodID)
        {
            foodId = foodID;                        
        }
        
        public Builder name(String name)
        {
            this.name = name;
            return this;
        }
        
        public Builder description(String descr)
        {
            this.description = descr;
            return this;
        }
        
        public Builder food(Food food)
        {
            this.description = food.description;
            this.foodId = food.foodId;
            this.name = food.name;
            return this;
        }
        public Food build()
        {
            return new Food(this);
        }        
        
    }    
    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getFoodId() {
        return foodId;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 13 * hash + this.foodId;
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
        final Food other = (Food) obj;
        if (this.foodId != other.foodId) {
            return false;
        }
        return true;
    }
    
    
    
}
