package edu.training.aliakseidubrouski.task.dogfarm.logic;

import edu.training.aliakseidubrouski.task.dogfarm.entity.aviary.Aviary;
import edu.training.aliakseidubrouski.task.dogfarm.entity.staff.AviaryCleaner;

/**
 * @uthor Aliaksei Dubrouski
 */
public class AviaryCleanerActivity {

    /**
     * For daily activity
     * @param aviaryCleaner - aviary for work with dogs
     * @param aviaryList - list of aviaries to be washed
     * @param NoStaffMessage - message for case, when aviary cleaners unavailable
     */

    public static synchronized void activity(AviaryCleaner aviaryCleaner, java.util.List<Aviary> aviaryList, String NoStaffMessage) {
        if(!(aviaryCleaner == null)) {
            aviaryList.stream().forEach(aviaryCleaner::work);
        }
        else {
            System.out.println(NoStaffMessage);
        }
    }
}
