package edu.training.aliakseidubrouski.task.dogfarm.logic.builder;

import edu.training.aliakseidubrouski.task.dogfarm.entity.dog.DogAge;

/**
 * Class contains food's data parameters for dogs off different ages.
 * @author Aliaksei_Dubrouski
 */
public class FoodBuilderDirector {
    private static final int FOOD_WEIGHT_FOR_YOUNG_DOG = 200;
    private static final int FOOD_CALORIES_FOR_YOUNG_DOG = 400;
    private static final int FOOD_WEIGHT_FOR_ADULT_DOG = 300;
    private static final int FOOD_CALORIES_FOR_ADULT_DOG = 700;
    private static final int FOOD_WEIGHT_FOR_OLD_DOG = 250;
    private static final int FOOD_CALORIES_FOR_OLD_DOG = 550;

    public void youngDogFood(Builder foodBuilder) {
        foodBuilder.setDogAge(DogAge.YOUNG);
        foodBuilder.setName("Best food for young puppy");
        foodBuilder.setWeight(FOOD_WEIGHT_FOR_YOUNG_DOG);
        foodBuilder.setCalories(FOOD_CALORIES_FOR_YOUNG_DOG);
    }

    public void adultDogFood(Builder foodBuilder) {
        foodBuilder.setDogAge(DogAge.ADULT);
        foodBuilder.setName("Better choice for dog lady's and gentlemen");
        foodBuilder.setWeight(FOOD_WEIGHT_FOR_ADULT_DOG);
        foodBuilder.setCalories(FOOD_CALORIES_FOR_ADULT_DOG);
    }

    public void oldDogFood(Builder foodBuilder) {
        foodBuilder.setDogAge(DogAge.OLD);
        foodBuilder.setName("Happy grandDog");
        foodBuilder.setWeight(FOOD_WEIGHT_FOR_OLD_DOG);
        foodBuilder.setCalories(FOOD_CALORIES_FOR_OLD_DOG);
    }

}
