package edu.training.aliakseidubrouski.task.dogfarm.logic.builder;

import edu.training.aliakseidubrouski.task.dogfarm.entity.dog.Dog;

import java.util.GregorianCalendar;

/**
 * @author Aliaksei Dubrouski
 */

public class DogBuilder {
    private String name = "DefaultName";
    private GregorianCalendar birthDate = new GregorianCalendar();

    public DogBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public DogBuilder setBirthDate(GregorianCalendar birthDate) {
        this.birthDate = birthDate;
        return this;
    }

    public Dog createDog() {
        return new Dog(name, birthDate);
    }
}
