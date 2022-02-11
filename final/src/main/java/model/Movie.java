package model;

import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.Arrays;

@AllArgsConstructor
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
    private int rents;

    @SerializedName("download")
    private int downloads;

    @SerializedName("rentMovie")
    private long rentMovie;

    @SerializedName("buyMovie")
    private long buyMovie;


    @Override
    public String toString() {
        return id + " - " + title + " - " + releaseYear +
                " - " + Arrays.toString(category) + " - " + length +
                " - " + rents + " - " + downloads ;
    }
}
