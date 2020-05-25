package edu.training.aliakseidubrouski.task.dogfarm;

import edu.training.aliakseidubrouski.task.dogfarm.entity.aviary.Aviary;
import edu.training.aliakseidubrouski.task.dogfarm.entity.day.Day;
import edu.training.aliakseidubrouski.task.dogfarm.entity.dog.Dog;
import edu.training.aliakseidubrouski.task.dogfarm.entity.dog.DogSpeciality;
import edu.training.aliakseidubrouski.task.dogfarm.entity.staff.*;
import edu.training.aliakseidubrouski.task.dogfarm.entity.trainingground.TrainingGround;
import edu.training.aliakseidubrouski.task.dogfarm.logic.builder.DayBuilder;
import edu.training.aliakseidubrouski.task.dogfarm.logic.builder.DogBuilder;

import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;

/**
 * @author Aliaksei Dubrouski
 */

public class MainDay {

    public static void main(String[] args) {

        Dog dog = new DogBuilder().setName("Nick").setBirthDate(new GregorianCalendar(2018, 5, 1)).createDog();
        Dog dog1 = new DogBuilder().setName("Dave").setBirthDate(new GregorianCalendar(2014, 4, 7)).createDog();
        Dog dog2 = new DogBuilder().setName("Spooky").setBirthDate(new GregorianCalendar(2019, 1, 5)).createDog();
        Dog dog3 = new DogBuilder().setName("Joe").setBirthDate(new GregorianCalendar(2017, 7, 3)).createDog();
        Dog dog4 = new DogBuilder().setName("Vasili").setBirthDate(new GregorianCalendar(2015, 6, 22)).createDog();
        Dog dog5 = new DogBuilder().setName("Toozik").setBirthDate(new GregorianCalendar(2012, 11, 13)).createDog();
        Dog dog6 = new DogBuilder().setName("SweetBob").setBirthDate(new GregorianCalendar(2016, 12, 19)).createDog();
        TrainingGround trainingGround = new TrainingGround();
        Aviary aviary = new Aviary();
        Aviary aviary1 = new Aviary();
        Aviary aviary2 = new Aviary();
        Aviary aviary3 = new Aviary();
        Aviary aviary4 = new Aviary();
        Aviary aviary5 = new Aviary();
        Aviary aviary6 = new Aviary();
        DogCoach dogCoach = new DogCoach("Fred");
        DogFeeder dogFeeder = new DogFeeder("ChappiOwner");
        DogVet dogVet = new DogVet("Alex");
        DogWorkManager dogWorkManager = new DogWorkManager("Bob");
        AviaryCleaner aviaryCleaner = new AviaryCleaner("Dani");

        dog.setDogSpeciality(DogSpeciality.POLICE_DOG);
        dog1.setDogSpeciality(DogSpeciality.GUIDE_DOG);
        dog2.setDogSpeciality(DogSpeciality.SNIFFER_DOG);
        dog3.setDogSpeciality(DogSpeciality.SEARCH_AND_RESCUE);
        dog4.setDogSpeciality(DogSpeciality.POLICE_DOG);
        dog5.setDogSpeciality(DogSpeciality.SNIFFER_DOG);
        dog6.setDogSpeciality(DogSpeciality.GUIDE_DOG);
        dog.setDisease(true);
        dog1.setDisease(true);
        dog2.setDisease(true);
        dog3.setDisease(false);
        dog4.setDisease(true);
        dog5.setDisease(false);
        dog6.setDisease(true);

        List<Dog> dogList = new ArrayList<>();
        dogList.add(dog);
        dogList.add(dog1);
        dogList.add(dog2);
        dogList.add(dog3);
        dogList.add(dog4);
        dogList.add(dog5);
        dogList.add(dog6);

        List<Aviary> aviaryList = new ArrayList<>();
        aviaryList.add(aviary);
        aviaryList.add(aviary1);
        aviaryList.add(aviary2);
        aviaryList.add(aviary3);
        aviaryList.add(aviary4);
        aviaryList.add(aviary5);
        aviaryList.add(aviary6);

        dogCoach.setTrainingGround(trainingGround);

        Day day = new DayBuilder().setDogList(dogList).setAviaryList(aviaryList).setTrainingGroundList(trainingGround).
                setDogBoss(dogWorkManager).setDogCoach(dogCoach).setDogFeeder(dogFeeder).setAviaryCleaner(aviaryCleaner).setDogVet(dogVet).createDay();

        day.dayAction();

    }
}
