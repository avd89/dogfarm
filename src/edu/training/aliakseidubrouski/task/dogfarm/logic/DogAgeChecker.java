package edu.training.aliakseidubrouski.task.dogfarm.logic;

import edu.training.aliakseidubrouski.task.dogfarm.entity.dog.Dog;
import edu.training.aliakseidubrouski.task.dogfarm.entity.dog.DogAge;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * @author Aliaksei Dubrouski
 */

public class DogAgeChecker {

    private static volatile GregorianCalendar currentDate = new GregorianCalendar();
    private static volatile int yearDifference = 0;

    /**
     * Method that check dog age(young,adult,old) and return enum DogAge parameter.
     * @param dog - checking dog age.
     * @return - determinate dog age in enum DogAge
     */

    public static synchronized DogAge getDogAge(Dog dog) {
        DogAge dogAge = null;
        if(currentDate.after(dog.getBirthDate())) {
            yearDifference = currentDate.get(Calendar.YEAR) - (dog.getBirthDate().get(Calendar.YEAR));

            if (yearDifference < 3) {
                dogAge = DogAge.YOUNG;
            } else if (yearDifference >= 3 & yearDifference < 8) {
                dogAge = DogAge.ADULT;
            } else if (yearDifference >= 8) {
                dogAge = DogAge.OLD;
            }
        }
        return dogAge;
    }
}
