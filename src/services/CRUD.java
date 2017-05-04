package services;

import entities.Student;
import entities.Teacher;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * Created by johan on 2017-05-04.
 */
public class CRUD {


        public void createStudent(String forName, String surName){
            Student student = new Student();
            student.setuForName(forName);
            student.setuSurName(surName);

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
            teacher.setuForName(forName);
            teacher.setuSurName(surName);

            EntityManagerFactory emFactory = Persistence.createEntityManagerFactory("persistence");
            EntityManager entityManager = emFactory.createEntityManager();

            entityManager.getTransaction().begin();
            entityManager.persist(teacher);
            entityManager.getTransaction().commit();

            entityManager.close();
            emFactory.close();

        }

}
