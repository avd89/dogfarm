package edu.training.aliakseidubrouski.task.dogfarm.entity.staff;

import edu.training.aliakseidubrouski.task.dogfarm.entity.dog.Dog;
import edu.training.aliakseidubrouski.task.dogfarm.entity.dog.DogAge;
import edu.training.aliakseidubrouski.task.dogfarm.entity.trainingground.TrainingGround;

/**
 * @author Aliaksei Dubrouski
 */

public class DogCoach extends Staff {

    private static final int COEFFICIENT_OF_TRAINING_LEVEL_GROWTH = 3;

    public DogCoach(String name) {
        super(name);
    }
    private TrainingGround trainingGround;

    /**
     * Train a dog and increase dog training coefficient by COEFFICIENT_OF_TRAINING_LEVEL_GROWTH.
     * @param dog - dog for training.
     */
    @Override
    public void work(Dog dog) {
        if(trainingGround == null) {
            System.out.println("DogCoach didn't found training aviary");
        }
        else if(!dog.isTrained() && dog.getDogAge().equals(DogAge.YOUNG)) {
            dog.setWork(true);
            dog.setTrained(COEFFICIENT_OF_TRAINING_LEVEL_GROWTH);
            System.out.println("Dog " + dog.getName() + " is on training now on the " + trainingGround.getName());
        }
    }

    public TrainingGround getTrainingGround() {
        return trainingGround;
    }

    public void setTrainingGround(TrainingGround trainingGround) {
        this.trainingGround = trainingGround;
    }


}