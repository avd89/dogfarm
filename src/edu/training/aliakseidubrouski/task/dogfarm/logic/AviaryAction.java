package edu.training.aliakseidubrouski.task.dogfarm.logic;

import edu.training.aliakseidubrouski.task.dogfarm.entity.aviary.Aviary;
import edu.training.aliakseidubrouski.task.dogfarm.entity.dog.Dog;

import java.util.List;

/**
 * @author Aliaksei Dubrouski
 * Contains method that add dogs in list to aviaries from aviares list.
 *
 */

public class AviaryAction {

    /**
     * Trying to put dogs in free aviaries.
     * @param dogList - list of dogs
     * @param aviaryList - aviaries for dogs
     */

    public static synchronized void setDogToAviary(List<Dog> dogList, List<Aviary> aviaryList) {
        for(Dog d : dogList) {
            for(Aviary av : aviaryList) {
                if(av.isBusy() == false) {
                    av.setDog(d);
                    System.out.println("Dog " + d.getName() + " is in " + av.getName() + " now.");
                    break;
                }
            }
        }
    }

}
