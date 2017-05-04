package entities;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by johan on 2017-05-03.
 */
@Entity
@Table
@Inheritance(strategy = InheritanceType.JOINED)

public class User implements Serializable{

    public User(String uForName, String uSurName){
        this.uForName =  uForName;
        this.uSurName = uSurName;


    }

    public User(){

    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int uId;

    String uForName;
    String uSurName;

    public String getuForName() {
        return uForName;
    }

    public void setuForName(String uForName) {
        this.uForName = uForName;
    }

    public String getuSurName() {
        return uSurName;
    }

    public void setuSurName(String uSurName) {
        this.uSurName = uSurName;
    }



}
