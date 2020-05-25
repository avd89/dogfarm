package edu.training.aliakseidubrouski.task.dogfarm.entity.trainingground;

import java.util.Objects;
import java.util.UUID;

/**
 * Training ground for trainings for coach with dogs.
 * @author Aliaksei Dubrouski
 */

public class TrainingGround {
    private UUID id;
    private String name;
    private boolean busy;
    private static volatile short trainingGroundCounter = 0;

    public TrainingGround() {
        id = UUID.randomUUID();
        name = "Training Ground" + trainingGroundCounter++;
    }

    public synchronized boolean isBusy() {
        return busy;
    }

    public synchronized void setBusy(boolean busy) {
        this.busy = busy;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TrainingGround that = (TrainingGround) o;
        return id.equals(that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "TrainingGround{" +
                "name='" + name + '\'' +
                '}';
    }
}
