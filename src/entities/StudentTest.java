package entities;

import javax.persistence.*;
import java.util.List;

/**
 * Created by josef on 5/4/2017.
 */


@Entity
public class StudentTest {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @PrimaryKeyJoinColumn(referencedColumnName = "uId")
    @OneToMany(targetEntity = studentQuestion.class)
    private List studenttQuestionList;

    private int studentTestId;

    private int date;

    public StudentTest() {

    }
    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

}
