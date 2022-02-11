package model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@AllArgsConstructor
@Getter
@Setter

public class RentMovie {
    private String idUser;
    private String idMovie;
    private String title;
    private LocalDate date;


    @Override
    public String toString() {
        return title + " - " + date;
    }
}
