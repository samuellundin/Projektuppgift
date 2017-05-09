package entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;

/**
 * Created by josef on 5/9/2017.
 */

@Entity
@Table
public class UserGroup implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int userId;


    public void UserGroup() {

        ArrayList userList = new ArrayList();

      //  userList.add(1,firstName);

    }
}
