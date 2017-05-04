package entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Created by Leon on 2017-05-04.
 */

@Entity
public class Answer {

    @Id
    @GeneratedValue( strategy= GenerationType.AUTO )
    private int answerId;
    private String answerText;

    /*Constructors*/
    public Answer(){

    }

    public Answer(String answerText){
        this.answerText =  answerText;
    }

    /*Getters and setters*/
    public int getAnswerId() {
        return  answerId;
    }

    public void setAnswerId(int answerId) {
        this.answerId = answerId;
    }

    public String getAnswerText() {
        return answerText;
    }

    public void setAnswerText(String answerText) {
        this.answerText = answerText;
    }
}
