package services;

import entities.Testity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * Created by johan on 2017-05-02.
 */
public class TestService {

    public static void main(String[] args){

        Testity testity = new Testity();
        testity.setFirstName("Johan");
        testity.setLastName("Samuelsson");

        EntityManagerFactory emFactory = Persistence.createEntityManagerFactory("persistence");
        EntityManager entityManager = emFactory.createEntityManager();

        entityManager.getTransaction().begin();
        entityManager.persist(testity);
        entityManager.getTransaction().commit();

        entityManager.close();
        emFactory.close();
    }


}
