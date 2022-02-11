package model;

import Util.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@AllArgsConstructor
@Setter
@Getter

public class User {
    private String id;
    private String name;
    private Gender gender;
    private long balance;
    private LocalDate birthday;
    private String phone;
    private String email;
    private String password;
    private Zone zone;

    @Override
    public String toString() {
        return id + " - " + zone.getValue() + " - " + name + " - " + gender.getValue() + " - " + Util.formatMoney(balance) +
                " - " + Util.formatDate(birthday) + " - " + phone + " - " + email;
    }
}
