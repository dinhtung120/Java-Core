package model;

import Util.Util;
import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import lombok.Setter;

import java.util.Arrays;

@Setter
@Getter
public class Movie {
    @SerializedName("id")
    private String id;

    @SerializedName("title")
    private String title;

    @SerializedName("releaseYear")
    private int releaseYear;

    @SerializedName("category")
    private String[] category;

    @SerializedName("length")
    private int length;

    @SerializedName("view")
    private int views;

    @SerializedName("download")
    private int downloads;

    @SerializedName("rentMovie")
    private long rentMovie;

    @SerializedName("buyMovie")
    private long buyMovie;

    public Movie(String title, int releaseYear, String[] category, int length, int views, int downloads, long rentMovie, long buyMovie) {
        this.id = "MO" + Util.randomNumber(6);
        this.title = title;
        this.releaseYear = releaseYear;
        this.category = category;
        this.length = length;
        this.views = views;
        this.downloads = downloads;
        this.rentMovie = rentMovie;
        this.buyMovie = buyMovie;
    }

    @Override
    public String toString() {
        return id + " - " + title + " - " + releaseYear +
                " - " + Arrays.toString(category) + " - " + length +
                " - " + views + " - " + downloads ;
    }
}
