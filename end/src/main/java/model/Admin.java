package model;

import Util.Gender;
import Util.Util;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter

public class Admin extends User {
    private LocalDate startingDate;

    public Admin(String name, Gender gender, long balance, LocalDate birthday, String phone, String email, LocalDate startingDate) {
        super(name, gender, balance, birthday, phone, email);
        this.startingDate = startingDate;
    }

    @Override
    public String toString() {
        return super.toString() + " - " + Util.formatDate(startingDate);
    }
}
