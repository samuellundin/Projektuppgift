package services;

import java.time.LocalDate;
import java.util.Date;

/**
 * Created by johan on 2017-05-09.
 */
public class testYourService {
    public static void main(String[] args){
        TestService testService = new TestService();
        LocalDate localDate =  LocalDate.now();


        testService.addTest("Ett prov", localDate, localDate, 10,100,true, true);

    }
}
