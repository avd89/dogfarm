package edu.training.aliakseidubrouski.task.dogfarm.entity.staff;

import edu.training.aliakseidubrouski.task.dogfarm.entity.aviary.Aviary;

import java.util.UUID;

/**
 * @author Aliaksei Dubrouski
 */

public class AviaryCleaner {

    private UUID id;
    private String name;

    public AviaryCleaner(String name) {
        id = UUID.randomUUID();
        this.name = name;
    }

    /**
     * Cleaning aviary and change aviary parameter clean to true.
     * @param aviary
     */
    public void work(Aviary aviary) {
        System.out.println("The aviary " + aviary.getName() + " is cleaning now.");
        aviary.setCleaned(true);
    }
}
