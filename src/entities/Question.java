package entities;

import javax.persistence.*;
import java.util.List;

/**
 * Created by johan on 2017-05-04.
 */
@Entity
public class Question {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int questionId;

    private int questionNumber;
    private char questionType;
    private String correctAnswer;


    @OneToMany(targetEntity = Answer.class)
    private List answerList;

    /*Constructors*/
    public Question(){

    }

    public Question(int questionId, int questionNumber, char questionType, String correctAnswer){
        this.questionId = questionId;
        this.questionNumber = questionNumber;
        this.questionType = questionType;
        this.correctAnswer = correctAnswer;
    }

    /*Getters and setters*/

    public int getQuestionId() {
        return questionId;
    }

    public void setQuestionId(int questionId) {
        this.questionId = questionId;
    }

    public int getQuestionNumber() {
        return questionNumber;
    }

    public void setQuestionNumber(int questionNumber) {
        this.questionNumber = questionNumber;
    }

    public char getQuestionType() {
        return questionType;
    }

    public void setQuestionType(char questionType) {
        this.questionType = questionType;
    }

    public String getCorrectAnswer() {
        return correctAnswer;
    }

    public void setCorrectAnswer(String correctAnswer) {
        this.correctAnswer = correctAnswer;
    }

    public List getAnswerList() {
        return answerList;
    }

    public void setAnswerList(List answerList) {
        this.answerList = answerList;
    }

}
