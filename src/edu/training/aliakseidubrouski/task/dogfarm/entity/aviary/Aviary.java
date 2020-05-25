package edu.training.aliakseidubrouski.task.dogfarm.entity.aviary;

import edu.training.aliakseidubrouski.task.dogfarm.entity.dog.Dog;

import java.util.Objects;
import java.util.Optional;
import java.util.UUID;

/**
 * @author Aliaksei Dubrouski
 *
 */

public class Aviary {

    private boolean busy;
    private Dog dog;
    private boolean clean;
    private UUID id;
    private String name;
    private static volatile short nameCounter = 0;

    public Aviary() {
        id = UUID.randomUUID();
        clean = true;
        name = "Aviary" + nameCounter++;
    }

    public Optional<Dog> getDog() {
        return Optional.ofNullable(dog);
    }

    public void setDog(Dog dog) {
        this.dog = dog;
        busy = true;
    }

    public boolean getCleaned() {
        return clean;
    }

    public void setCleaned(boolean clean) {
        this.clean = clean;
    }

    public boolean isBusy() {
        return busy;
    }

    public void freeAviaryFromDog() {
        dog = null;
        busy = false;
    }

    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Aviary aviary = (Aviary) o;
        return id.equals(aviary.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Aviary{" +
                "name='" + name + '\'' +
                '}';
    }
}
