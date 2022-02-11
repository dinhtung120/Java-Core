package service;

import Util.Gender;
import Util.Zone;
import model.User;

import java.time.LocalDate;
import java.util.ArrayList;

public class UserService {
    public ArrayList<User> getAllUser() {
        ArrayList<User> newUsers = new ArrayList<>();

        newUsers.add(new User("U000000", "Tùng", Gender.MALE, 1000000000, LocalDate.of(1994, 11, 3),
                "0985622211", "newstarvn01@gmail.com", "123456", Zone.A));
        newUsers.add(new User("U000001", "Người quản lý 1", Gender.FMALE, 10000000, LocalDate.of(1999, 9, 1),
                "0985000001", "nguoidung1@gmail.com", "123456", Zone.B));
        newUsers.add(new User("U000002", "Người quản lý 2", Gender.MALE, 10000000, LocalDate.of(1999, 9, 2),
                "0985000002", "nguoidung2@gmail.com", "123456", Zone.B));
        newUsers.add(new User("U000003", "Người dùng 1", Gender.FMALE, 1000000, LocalDate.of(1999, 9, 3),
                "0985000003", "nguoidung3@gmail.com", "123456", Zone.D));
        newUsers.add(new User("U000004", "Người dùng 2", Gender.MALE, 1000000, LocalDate.of(1999, 9, 4),
                "0985000004", "nguoidung4@gmail.com", "123456", Zone.D));
        newUsers.add(new User("U000005", "Người dùng 3", Gender.FMALE, 1000000, LocalDate.of(1999, 9, 5),
                "0985000005", "nguoidung5@gmail.com", "123456", Zone.D));
        newUsers.add(new User("U000006", "Người dùng 4", Gender.MALE, 1000000, LocalDate.of(1999, 9, 6),
                "0985000006", "nguoidung6@gmail.com", "123456", Zone.D));
        newUsers.add(new User("U000007", "Người dùng 5", Gender.FMALE, 1000000, LocalDate.of(1999, 9, 7),
                "0985000007", "nguoidung7@gmail.com", "123456", Zone.D));
        newUsers.add(new User("U000008", "Người dùng 6", Gender.MALE, 0, LocalDate.of(1999, 9, 8),
                "0985000008", "nguoidung8@gmail.com", "123456", Zone.D));

        return newUsers;
    }

    public User checkLogin(String phone, String password, ArrayList<User> users) {
        for (User user:users){
            if (user.getPhone().equals(phone) && user.getPassword().equals(password)){
                return user;
            }
        }
        return null;
    }


}
