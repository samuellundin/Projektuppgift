package entities;

import javax.persistence.*;
import java.util.List;

/**
 * Created by johan on 2017-05-03.
 */
@Entity
@PrimaryKeyJoinColumn(referencedColumnName = "uId")


public class Student extends User {



    @OneToMany(targetEntity = StudentTest.class)
    private List studentTestList;
    public Student(String uForName, String uSurName, String major) {
        super(uForName, uSurName);
    }

    public Student() {
    }

    public String toString() {
        System.out.println(super.getuForName() + super.getuSurName());
        return super.getuForName() + super.getuSurName();

    }
    public List getStudentTestList() {
        return studentTestList;
    }

    public void setStudentTestList(List studentTestList) {
        this.studentTestList = studentTestList;
    }
}
