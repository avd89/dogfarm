package edu.training.aliakseidubrouski.task.dogfarm.logic.builder;

import edu.training.aliakseidubrouski.task.dogfarm.entity.dog.DogAge;
import edu.training.aliakseidubrouski.task.dogfarm.entity.food.Food;

/**
 * Pattern builder for creating food object
 * @author Aliaksei Dubrouski
 */
public class FoodBuilder implements Builder {

    private String name;
    private int calories;
    private int weight;
    private DogAge dogAge;

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public void setCalories(int calories) {
        this.calories = calories;
    }

    @Override
    public void setDogAge(DogAge dogAge) {
        this.dogAge = dogAge;
    }

    public Food getResult() {
        return new Food(name, calories, weight, dogAge);
    }
}
