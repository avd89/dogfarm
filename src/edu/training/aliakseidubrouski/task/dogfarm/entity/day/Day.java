package edu.training.aliakseidubrouski.task.dogfarm.entity.day;

import edu.training.aliakseidubrouski.task.dogfarm.entity.aviary.Aviary;
import edu.training.aliakseidubrouski.task.dogfarm.entity.dog.Dog;
import edu.training.aliakseidubrouski.task.dogfarm.entity.staff.*;
import edu.training.aliakseidubrouski.task.dogfarm.entity.trainingground.TrainingGround;
import edu.training.aliakseidubrouski.task.dogfarm.logic.AviaryAction;
import edu.training.aliakseidubrouski.task.dogfarm.logic.AviaryCleanerActivity;
import edu.training.aliakseidubrouski.task.dogfarm.logic.DayActivity;

import java.util.GregorianCalendar;
import java.util.List;
import java.util.Optional;

/**
 * @author Aliaksei_Dubrouski
 */

public class Day {
    private List<Dog> dogList;
    private TrainingGround trainingGround;
    private List<Aviary> aviaryList;
    private DogWorkManager dogBoss;
    private DogVet dogVet;
    private DogFeeder dogFeeder;
    private DogCoach dogCoach;
    private AviaryCleaner aviaryCleaner;
    private GregorianCalendar date;

    public Day(List<Dog> dogList, TrainingGround trainingGround, List<Aviary> aviaryList, DogWorkManager dogBoss, DogVet dogVet,
               DogFeeder dogFeeder, DogCoach dogCoach, AviaryCleaner aviaryCleaner) {
        this.dogList = dogList;
        this.trainingGround = trainingGround;
        this.aviaryList = aviaryList;
        this.dogBoss = dogBoss;
        this.dogCoach = dogCoach;
        this.dogVet = dogVet;
        this.dogFeeder = dogFeeder;
        this.aviaryCleaner = aviaryCleaner;
    }

    /**
     * Usual day activity of dog farm
     */
    public void dayAction() {

        if(date == null) {
            date = new GregorianCalendar();
        }

        AviaryAction.setDogToAviary(dogList, aviaryList);

        DayActivity.activity(dogFeeder, dogList, "Dogs are not fed. Can't find any Feeder.");

        DayActivity.activity(dogVet, dogList, "Medical examination did not take a place. There is no dog vet.");

        DayActivity.activity(dogBoss, dogList, "Dogs can't go to work. There is no dog work manager.");

        DayActivity.activity(dogCoach, dogList, "Dogs can't be trained. There is no dog coach.");

        AviaryCleanerActivity.activity(aviaryCleaner,aviaryList,"Aviaries can't be cleaned. There is no aviary cleaner.");

        DayActivity.activity(dogFeeder, dogList, "Dogs are not fed. Can't find any Feeder.");

        AviaryAction.setDogToAviary(dogList, aviaryList);
    }

    public Optional<GregorianCalendar> getDate() {
        return Optional.ofNullable(date);
    }

    public void setDate(GregorianCalendar date) {
        this.date = date;
    }
}
