package edu.training.aliakseidubrouski.task.dogfarm.entity.dog;

import edu.training.aliakseidubrouski.task.dogfarm.logic.DogAgeChecker;

import java.util.*;

/**
 * @author Aliaksei Dubrouski
 * Class describes dogs
 */
public class Dog {
    public static final int TRAINED_DOG_COEFFICIENT = 80;
    private UUID id;
    private String name;
    private GregorianCalendar birthDate;
    private DogAge dogAge;
    private boolean feed;
    private boolean disease;
    private boolean work;
    private int trainingCoefficient;
    private DogSpeciality dogSpeciality;

    public Dog(String name, GregorianCalendar birthDate) {
        this.name = name;
        this.birthDate = birthDate;
        id = UUID.randomUUID();
        dogAge = DogAgeChecker.getDogAge(this);
    }

    public DogSpeciality getDogSpeciality() {
        return dogSpeciality;
    }

    public void setDogSpeciality(DogSpeciality dogSpeciality) {
        this.dogSpeciality = dogSpeciality;
    }

    public boolean isDisease() {
        return disease;
    }

    public void setDisease(Boolean disease) {
        this.disease = disease;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UUID getId() {
        return id;
    }

    public DogAge getDogAge() {
        return dogAge;
    }

    public GregorianCalendar getBirthDate() {
        return birthDate;
    }

    public void setDogAge(DogAge dogAge) {
        this.dogAge = dogAge;
    }

    public int getTrained() {
        return trainingCoefficient;
    }

    public void setTrained(int trained) {
        this.trainingCoefficient = this.trainingCoefficient + trained;
    }

    public boolean isTrained() {
        return trainingCoefficient >= TRAINED_DOG_COEFFICIENT;
    }

    public boolean isFeed() {
        return feed;
    }

    public void setFeed() {
        this.feed = true;
    }

    public boolean isWork() {
        return work;
    }

    public void setWork(boolean work) {
        this.work = work;
    }

    @Override
    public String toString() {
        return "Dog " + getName() +
                ". Age " + getDogAge() +
                ". Speciality " + getDogSpeciality();
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = hash * 17 + id.hashCode();
        return hash;
    }

    @Override
    public boolean equals(Object o) {
        if(this == o) return true;
        if(o==null) return false;
        if(this.getClass() != o.getClass()) return false;
        Dog dog = (Dog) o;
        return dog.getId().equals(getId());
    }
}
