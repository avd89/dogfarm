package edu.training.aliakseidubrouski.task.dogfarm.entity.staff;

import edu.training.aliakseidubrouski.task.dogfarm.entity.dog.Dog;

/**
 * @author Aliaksei Dubrouski
 */

public class DogVet extends Staff {

    public DogVet(String name) {
        super(name);
    }

    /**
     * Checking dog for disease and treating it (change dog's parameter disease to false.)
     * @param dog - veterinarian dog.
     */
    @Override
    public void work(Dog dog) {
        synchronized (this) {
            if (dog.isDisease()) {
                System.out.println("Treating dog " + dog.getName());
                System.out.println("The dog " + dog.getName() + " was treated");
                dog.setDisease(false);
            }
            else {
                System.out.println("Dog " + dog.getName() + " is healthy");
            }
        }
    }
}
