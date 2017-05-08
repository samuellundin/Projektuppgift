package services;

public class TestService {

    public static void main(String[] args){
        CRUD crud = new CRUD();
        crud.createUser("firstname", "lastname", "email", "password", 1);
    }

}
