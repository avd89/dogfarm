package edu.training.aliakseidubrouski.task.dogfarm.logic.builder;

import edu.training.aliakseidubrouski.task.dogfarm.entity.aviary.Aviary;
import edu.training.aliakseidubrouski.task.dogfarm.entity.day.Day;
import edu.training.aliakseidubrouski.task.dogfarm.entity.dog.Dog;
import edu.training.aliakseidubrouski.task.dogfarm.entity.staff.*;
import edu.training.aliakseidubrouski.task.dogfarm.entity.trainingground.TrainingGround;

import java.util.List;

/**
 * Builder to create day
 * @author Aliaksei Dubrouski
 */

public class DayBuilder {
    private List<Dog> dogList;
    private TrainingGround trainingGround;
    private List<Aviary> aviaryList;
    private DogWorkManager dogBoss;
    private DogVet dogVet;
    private DogFeeder dogFeeder;
    private DogCoach dogCoach;
    private AviaryCleaner aviaryCleaner;

    public DayBuilder setDogList(List<Dog> dogList) {
        this.dogList = dogList;
        return this;
    }

    public DayBuilder setTrainingGroundList(TrainingGround trainingGround) {
        this.trainingGround = trainingGround;
        return this;
    }

    public DayBuilder setAviaryList(List<Aviary> aviaryList) {
        this.aviaryList = aviaryList;
        return this;
    }

    public DayBuilder setDogBoss(DogWorkManager dogBoss) {
        this.dogBoss = dogBoss;
        return this;
    }

    public DayBuilder setDogVet(DogVet dogVet) {
        this.dogVet = dogVet;
        return this;
    }

    public DayBuilder setDogFeeder(DogFeeder dogFeeder) {
        this.dogFeeder = dogFeeder;
        return this;
    }

    public DayBuilder setDogCoach(DogCoach dogCoach) {
        this.dogCoach = dogCoach;
        return this;
    }

    public DayBuilder setAviaryCleaner(AviaryCleaner aviaryCleaner) {
        this.aviaryCleaner = aviaryCleaner;
        return this;
    }

    public Day createDay() {
        return new Day(dogList, trainingGround, aviaryList, dogBoss, dogVet, dogFeeder, dogCoach, aviaryCleaner);
    }
}
