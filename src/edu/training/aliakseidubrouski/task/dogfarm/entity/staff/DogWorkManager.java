package edu.training.aliakseidubrouski.task.dogfarm.entity.staff;

import edu.training.aliakseidubrouski.task.dogfarm.entity.dog.Dog;
import edu.training.aliakseidubrouski.task.dogfarm.entity.dog.DogAge;

/**
 * @author Aliaksei Dubrouski
 */
public class DogWorkManager extends Staff{

    public DogWorkManager(String name) {
        super(name);
    }

    /**
     * Sends the dog to work, which depends of the dog's speciality
     * @param dog
     */
    @Override
    public void work(Dog dog) {
        synchronized (this) {
            if(dog.isDisease()){
                System.out.println("The dog " + dog.getName() + " is ill");
            }

            if (dog.getDogAge().equals(DogAge.ADULT)) {
                switch (dog.getDogSpeciality()) {
                    case GUIDE_DOG: {
                        dog.setWork(true);
                        System.out.println("Dog " + dog.getName() + " is going to guide route.");
                        break;
                    }
                    case POLICE_DOG: {
                        dog.setWork(true);
                        System.out.println("Dog " + dog.getName() + " is catching thief with policemen");
                        break;
                    }
                    case SNIFFER_DOG: {
                        dog.setWork(true);
                        System.out.println("Dog " + dog.getName() + " is trying to find drugs");
                        break;
                    }
                    case SEARCH_AND_RESCUE: {
                        dog.setWork(true);
                        System.out.println("Dog " + dog.getName() + " is trying to rescue another man");
                        break;
                    }
                }
            } else if (dog.getDogAge().equals(DogAge.OLD)) {
                System.out.println("Dog " + dog.getName() + " is to old for work");

            } else if (dog.getDogAge().equals(DogAge.YOUNG)) {
                System.out.println("Dog " + dog.getName() + " is to young for work");
            }
        }
    }
}
