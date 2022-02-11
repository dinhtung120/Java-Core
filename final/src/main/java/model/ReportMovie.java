package model;

import Util.Util;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class ReportMovie {
    private String id;
    private String idUser;
    private String idMovie;
    private String titleMovie;
    private LocalDate date;
    private String content;

    public ReportMovie(String idUser, String idMovie, String titleMovie, LocalDate date, String content) {
        this.id = Util.randomId(4);
        this.idUser = idUser;
        this.idMovie = idMovie;
        this.titleMovie = titleMovie;
        this.date = date;
        this.content = content;
    }

    @Override
    public String toString() {
        return id + " - " + idUser + " - " + idMovie + " - " +
                titleMovie + " - " + date + " - " + content;
    }
}
