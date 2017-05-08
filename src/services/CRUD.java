package services;

import entities.Student;
import entities.Teacher;
import entities.User;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * Created by johan on 2017-05-04.
 */
public class CRUD {

        public void createUser(String firstName, String lastName, String email, String password) {
            EntityManagerFactory emFactory = Persistence.createEntityManagerFactory("persistence");
            EntityManager entityManager = emFactory.createEntityManager();

            User user = new User();
            user.setFirstName(firstName);
            user.setLastName(lastName);
            user.setEmail(email);
            user.setPassword(password);

            entityManager.getTransaction().begin();
            entityManager.persist(user);
            entityManager.getTransaction().commit();

            entityManager.close();
            emFactory.close();
        }

        public void createStudent(String forName, String surName){
            Student student = new Student();

            EntityManagerFactory emFactory = Persistence.createEntityManagerFactory("persistence");
            EntityManager entityManager = emFactory.createEntityManager();

            entityManager.getTransaction().begin();
            entityManager.persist(student);
            entityManager.getTransaction().commit();

            entityManager.close();
            emFactory.close();
        }

        public  void createTeacher(String forName, String surName){
            Teacher teacher = new Teacher();

            EntityManagerFactory emFactory = Persistence.createEntityManagerFactory("persistence");
            EntityManager entityManager = emFactory.createEntityManager();

            entityManager.getTransaction().begin();
            entityManager.persist(teacher);
            entityManager.getTransaction().commit();

            entityManager.close();
            emFactory.close();
        }

}
