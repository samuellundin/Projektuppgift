package services;

public class TestService {

    public static void main(String[] args){
        Service service = new Service();
        service.addUser("firstname", "lastname", "email", "password", 1);
    }

}
