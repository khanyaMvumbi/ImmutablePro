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
public class FeedAnimal {
    
    private int foodID;
    private boolean feed;
    private List<Food> food;
    private List<Animal>animal;

    private FeedAnimal(Builder build) {
        this.foodID = build.foodID;
        this.feed = build.feed;
        this.food = build.food;
        this.animal = build.animal;
    }

    
    
    public static class Builder
    {
    private int foodID;
    private boolean feed;
    private List<Food> food;
    private List<Animal>animal;
       
    public Builder(int foodID)
    {    
        this.foodID = foodID;
    }

        public Builder FoodID(int foodID) {
            this.foodID = foodID;
            return this;
        }

        public Builder Feed(boolean feed) {
            this.feed = feed;
            return this;
        }

        public Builder Food(List<Food> food) {
            this.food = food;
            return this;
        }

        public Builder setAnimal(List<Animal> animal) {
            this.animal = animal;
            return this;
        }    
    
     public Builder feedAnimal(FeedAnimal feeds){
          animal =  feeds.getAnimal();
          food = feeds.getFood();
          foodID = feeds.getFoodID();
          feed = feeds.isFeed();          
          return this;
    }
     
     public FeedAnimal build()
     {
         return new FeedAnimal(this);
     }
    }
    
    public int getFoodID() {
        return foodID;
    }

    public boolean isFeed() {
        return feed;
    }

    public List<Food> getFood() {
        return food;
    }    
   
    public List<Animal> getAnimal() {
        return animal;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + this.foodID;
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
        final FeedAnimal other = (FeedAnimal) obj;
        if (this.foodID != other.foodID) {
            return false;
        }
        return true;
    }
    
    
    
    
}
