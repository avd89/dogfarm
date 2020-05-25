package edu.training.aliakseidubrouski.task.dogfarm.logic;

import edu.training.aliakseidubrouski.task.dogfarm.entity.dog.Dog;
import edu.training.aliakseidubrouski.task.dogfarm.entity.staff.Staff;

import java.util.List;

/**
 * @author Aliaksei Dubrouski
 */

public class DayActivity {

    /**
     * For usual daily staff activity
     * @param staff - staff for working with dogs
     * @param list - list off available dogs
     * @param NoStaffMessage - list for case when staff are not available
     */

    public static synchronized void activity(Staff staff, List<Dog> list, String NoStaffMessage) {
        if(!(staff == null)) {
            list.stream().forEach(staff::work);
        }
        else {
            System.out.println(NoStaffMessage);
        }
    }
}
