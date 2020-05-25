package edu.training.aliakseidubrouski.task.dogfarm.entity.staff;

import edu.training.aliakseidubrouski.task.dogfarm.entity.dog.Dog;
import edu.training.aliakseidubrouski.task.dogfarm.logic.builder.FoodBuilder;
import edu.training.aliakseidubrouski.task.dogfarm.logic.builder.FoodBuilderDirector;
import edu.training.aliakseidubrouski.task.dogfarm.schedule.FeedSchedule;

/**
 * @author Aliaksei Dubrouski
 * Description of staff who feed dogs with diferent food(depending of the dog age)
 */

public class DogFeeder extends Staff{

    private FoodBuilderDirector foodBuilderDirector;
    private FoodBuilder foodBuilder;

    public DogFeeder(String name) {
        super(name);
        foodBuilderDirector = new FoodBuilderDirector();
        foodBuilder = new FoodBuilder();
    }

    /**
     * Feed dog (add dog's food to FeedSchedule) and change dog parameter feed to true
     * @param dog - dog getting food
     */

    @Override
    public void work(Dog dog) {

        switch(dog.getDogAge()) {
            case YOUNG : {
                foodBuilderDirector.youngDogFood(foodBuilder);
                FeedSchedule.getInstance().setFoodToDogFeedSchedule(dog, foodBuilder.getResult());
                dog.setFeed();
                System.out.println("The dog " + dog.getName() + " was fed.");
                break;
            }
            case ADULT: {
                foodBuilderDirector.adultDogFood(foodBuilder);
                FeedSchedule.getInstance().setFoodToDogFeedSchedule(dog, foodBuilder.getResult());
                dog.setFeed();
                System.out.println("The dog " + dog.getName() + " was fed.");
                break;
            }
            case OLD: {
                foodBuilderDirector.oldDogFood(foodBuilder);
                FeedSchedule.getInstance().setFoodToDogFeedSchedule(dog, foodBuilder.getResult());
                dog.setFeed();
                System.out.println("The dog " + dog.getName() + " was fed.");
                break;
            }
        }
    }

}
