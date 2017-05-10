package entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;

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

        User u = new User();

        ArrayList userList = new ArrayList();
        userList.addAll(Arrays.asList(u));

      //  userList.add(1,firstName);

    }
}
