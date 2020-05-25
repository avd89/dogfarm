package edu.training.aliakseidubrouski.task.dogfarm.entity.food;


import edu.training.aliakseidubrouski.task.dogfarm.entity.dog.DogAge;

/**
 * Describes food, that dogs get
 * @author Aliaksei_Dubrouski
 */
public class Food {

    private String name;
    private int calories;
    private int weight;
    private DogAge dogAge;


    public Food(String name, int weight, int calories, DogAge dogAge) {
        this.name = name;
        this.weight = weight;
        this.calories = calories;
        this.dogAge = dogAge;
    }

    public String getName() {
        return name;
    }

    public int getCalories() {
        return calories;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "Food " + getName() ;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = hash * 17 + name.hashCode();
        hash = hash * 17 + calories;
        hash = hash * 17 + weight;
        return hash;
    }

    @Override
    public boolean equals(Object o) {
        if(this == o) return true;
        if(o==null) return false;
        if(this.getClass() != o.getClass()) return false;
        Food food = (Food) o;
        return food.getCalories() == getCalories() &&
                food.getWeight() == getWeight() &&
                food.getName().equals(((Food) o).getName());
    }
}

