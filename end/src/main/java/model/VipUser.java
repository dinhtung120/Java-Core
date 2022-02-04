package model;

import Util.Gender;
import Util.Util;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class VipUser extends User {
    private LocalDate expirationDate;

    public VipUser(String name, Gender gender, long balance, LocalDate birthday, String phone, String email, LocalDate expirationDate) {
        super(name, gender, balance, birthday, phone, email);
        this.expirationDate = expirationDate;
    }

    @Override
    public String toString() {
        return super.toString() + " - " + Util.formatDate(expirationDate);
    }
}
