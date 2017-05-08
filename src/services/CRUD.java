package services;

import entities.User;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class CRUD {

        public void createUser(String firstName, String lastName, String email, String password, int role) {
            EntityManagerFactory emFactory = Persistence.createEntityManagerFactory("persistence");
            EntityManager entityManager = emFactory.createEntityManager();

            User user = new User();
            user.setFirstName(firstName);
            user.setLastName(lastName);
            user.setEmail(email);
            user.setPassword(password);
            user.setRole(role);

            entityManager.getTransaction().begin();
            entityManager.persist(user);
            entityManager.getTransaction().commit();

            entityManager.close();
            emFactory.close();
        }

}
