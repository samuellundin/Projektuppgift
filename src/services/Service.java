package services;

import entities.User;

import javax.persistence.*;

public class Service {

    private EntityManagerFactory managerFactory = Persistence.createEntityManagerFactory("persistence");
    private EntityManager entityManager = managerFactory.createEntityManager();

    public User login(String email, String password) {
        try {
            TypedQuery<User> query = entityManager.createQuery("SELECT u FROM User u WHERE u.email = :email AND u.password = :password", User.class);
            query.setParameter("email", email);
            query.setParameter("password", password);
            return query.getSingleResult();
        } catch (NoResultException ex) {
            return null;
        }
    }
}
