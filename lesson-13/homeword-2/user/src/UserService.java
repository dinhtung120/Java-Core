import exception.ValidateException;
import util.Gender;
import util.Menu;
import util.Validate;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class UserService {
    Scanner scanner = new Scanner(System.in);

    public ArrayList<User> getAllUser() {
        ArrayList<User> users = new ArrayList<>();

        users.add(new User("KH1234561", "Tùng", LocalDate.of(1994, 11, 3),
                Gender.MALE, "Hòa Bình", "0985622211", "newstarvn01@gmail.com"));
        users.add(new User("KH1234562", "Tuấn", LocalDate.of(1984, 10, 13),
                Gender.MALE, "Hà Nội", "0985622212", "newstarvn02@gmail.com"));
        users.add(new User("KH1234563", "Hoa", LocalDate.of(1996, 9, 19),
                Gender.FMALE, "Nam Định", "0985622213", "newstarvn03@gmail.com"));
        users.add(new User("KH1234564", "Vy", LocalDate.of(1995, 6, 10),
                Gender.FMALE, "Vĩnh Phúc", "0985622214", "newstarvn04@gmail.com"));
        users.add(new User("KH1234565", "Công", LocalDate.of(1994, 5, 23),
                Gender.MALE, "Vinh", "0985622215", "newstarvn05@gmail.com"));
        users.add(new User("KH1234566", "Phương", LocalDate.of(1993, 1, 9),
                Gender.FMALE, "Hà Nội", "0985622216", "newstarvn06@gmail.com"));
        users.add(new User("KH1234567", "Quỳnh", LocalDate.of(1998, 5, 16),
                Gender.FMALE, "Sơn La", "0985622217", "newstarvn07@gmail.com"));
        users.add(new User("KH1234568", "Đức", LocalDate.of(1999, 5, 6),
                Gender.MALE, "Hà Giang", "0985622218", "newstarvn08@gmail.com"));
        users.add(new User("KH1234569", "Vũ", LocalDate.of(1994, 6, 5),
                Gender.MALE, "Yên Bái", "0985622219", "newstarvn09@gmail.com"));

        return users;
    }

    public void show(ArrayList<User> users) {
        for (User user : users) {
            System.out.println(user);
        }
    }

    public void showByGender(ArrayList<User> users) {
        System.out.println("Chọn 1: Để xem danh sách khách hàng nữ");
        System.out.println("Chọn 2: Để xem danh sách khách hàng nam");
        int choice = Integer.parseInt(scanner.nextLine());
        Gender gender;

        if (choice == 1) {
            gender = Gender.FMALE;
            for (User user : users) {
                if (user.getGender() == gender) {
                    System.out.println(user);
                }
            }
        } else if (choice == 2) {
            gender = Gender.MALE;
            for (User user : users) {
                if (user.getGender() == gender) {
                    System.out.println(user);
                }
            }
        } else {
            System.out.println("Không có lựa chọn này");
        }
    }

}
