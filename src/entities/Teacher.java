package entities;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

/**
 * Created by johan on 2017-05-03.
 */

@Entity
@PrimaryKeyJoinColumn(referencedColumnName="uId")
public class Teacher extends User {

    public Teacher(){

    }

    public Teacher(String uForName, String uSurName) {
        super(uForName, uSurName);
    }

    @Override
    public String toString(){
        System.out.println(super.getuForName() + super.getuSurName());
        return super.getuForName() + super.getuSurName();

    }
}
