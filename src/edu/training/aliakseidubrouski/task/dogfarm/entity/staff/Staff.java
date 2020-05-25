package edu.training.aliakseidubrouski.task.dogfarm.entity.staff;

import edu.training.aliakseidubrouski.task.dogfarm.entity.dog.Dog;

import java.util.UUID;

/**
 * @author Aliaksei Dubrouski
 */

public abstract class Staff {
    private UUID id;
    private String name;

    public Staff(String name) {
        id = UUID.randomUUID();
        this.name = name;
    }

    public  abstract void work(Dog dog);

    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Staff " + getName();
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
        Staff staff = (Staff) o;
        return staff.getId().hashCode() == getId().hashCode();
    }
}