package edu.training.aliakseidubrouski.task.dogfarm.schedule;

import edu.training.aliakseidubrouski.task.dogfarm.entity.dog.Dog;
import edu.training.aliakseidubrouski.task.dogfarm.entity.food.Food;

import java.util.*;

/**
 * Food schedule for every dog. Contains information about every dog's food and feed date in Map<GregorianCalendar, Food> format.
 * @author Aliaksei Dubrouski
 */

public class FeedSchedule {
    private static volatile FeedSchedule instance;
    private static volatile Map<Dog, Map<GregorianCalendar, Food>> dogsFeedSchedule;

    private FeedSchedule(){}

    public static FeedSchedule getInstance() {
        FeedSchedule localInstance = instance;
        if(localInstance == null) {
            synchronized (FeedSchedule.class) {
                localInstance = instance;
                if(localInstance == null) {
                    instance = localInstance = new FeedSchedule();
                    dogsFeedSchedule = new HashMap<Dog, Map<GregorianCalendar, Food>>();
                }
            }
        }
        return localInstance;
    }

    /**
     * Add data about every dog feeding time and food
     * @param dog - fed dog
     * @param food - dog;s food
     */
    public synchronized void setFoodToDogFeedSchedule(Dog dog, Food food) {
        if (!dogsFeedSchedule.containsKey(dog)) {
            dogsFeedSchedule.put(dog, new TreeMap<GregorianCalendar, Food>());
        }
        dogsFeedSchedule.get(dog).put(new GregorianCalendar(), food);
    }

    /**
     * Access for dog's food schedule in Map<> format
     * @param dog
     * @return dog's Map<GregorianCalendar, Food>
     */
    public synchronized Map<GregorianCalendar, Food> getDogFoodSchedule(Dog dog) {

        return dogsFeedSchedule.get(dog);
    }
}
