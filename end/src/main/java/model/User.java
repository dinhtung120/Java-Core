package model;

import Util.Gender;
import Util.Util;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter

public class User {
    private String id;
    private String name;
    private Gender gender;
    private long balance;
    private LocalDate birthday;
    private String phone;
    private String email;

    public User(String name, Gender gender, long balance, LocalDate birthday, String phone, String email) {
        this.id = "USER" + Util.randomNumber(6);
        this.name = name;
        this.gender = gender;
        this.balance = balance;
        this.birthday = birthday;
        this.phone = phone;
        this.email = email;
    }

    @Override
    public String toString() {
        return
                id + " - " + name + " - " + gender + " - " + Util.formatMoney(balance) +
                        " - " + Util.formatDate(birthday) + " - " + phone + " - " + email;
    }
}
