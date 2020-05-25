package edu.training.aliakseidubrouski.task.dogfarm.logic.builder;

import edu.training.aliakseidubrouski.task.dogfarm.entity.dog.DogAge;

/**
 * Food Builder interface
 * @author Aliaksei_Dubrouski
 */
public interface Builder {

    void setName(String name);
    void setWeight(int weight);
    void setCalories(int calories);
    void setDogAge(DogAge dogAge);

}
