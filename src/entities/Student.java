package entities;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

/**
 * Created by johan on 2017-05-03.
 */
@Entity
@PrimaryKeyJoinColumn(referencedColumnName="uId")
public class Student extends User {

    public Student(String uForName, String uSurName, String major) {
        super(uForName, uSurName);
    }

    public Student(){
        super();
    }

    @Override
    public String toString(){
        System.out.println(super.getuForName() + super.getuSurName());
        return super.getuForName() + super.getuSurName();

    }


}
