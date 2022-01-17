package service;

import model.User;

import java.util.ArrayList;

public class UserService {

    public ArrayList<User> getAllUser(){
        ArrayList<User> users = new ArrayList<>();
        users.add(new User("tung","tung@gmail.com","123"));
        users.add(new User("tung2","tung2@gmail.com","1232"));
        users.add(new User("tung3","tung3@gmail.com","1233"));
        users.add(new User("tung4","tung4@gmail.com","1234"));
        users.add(new User("tung5","tung5@gmail.com","1235"));

        return users;
    }

    public User checkEmail(ArrayList<User> users, String email){
        for (User user: users){
            if(user.getEmail().equals(email)){
                return user;
            }
        }
        return null;
    }

}
