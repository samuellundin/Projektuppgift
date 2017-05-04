package entities;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by johan on 2017-05-04.
 */
@Entity
public class Test {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int testId;

    private String testName;
    private int numQuestion;
    private String description;


    @OneToMany(targetEntity = Question.class)
    private List questionList;

    /*Constructors*/

    public Test(){

    }

    public Test(int testId, String testName, int numQuestion, String description){
        this.testId = testId;
        this.testName = testName;
        this.numQuestion = numQuestion;
        this.description = description;
    }

    /*Getters and setters*/

    public int getTestId() {
        return testId;
    }

    public void setTestId(int testId) {
        this.testId = testId;
    }

    public String getTestName() {
        return testName;
    }

    public void setTestName(String testName) {
        this.testName = testName;
    }

    public int getNumQuestion() {
        return numQuestion;
    }

    public void setNumQuestion(int numQuestion) {
        this.numQuestion = numQuestion;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List getQuestionList() {
        return questionList;
    }

    public void setQuestionList(List questionList) {
        this.questionList = questionList;
    }



}
