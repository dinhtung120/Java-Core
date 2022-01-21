import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class User {
    @SerializedName("id")
    private String id;

    @SerializedName("name")
    private String name;

    @SerializedName("birthday")
    private LocalDate birthday;

    @SerializedName("gender")
    private Gender gender;

    @SerializedName("address")
    private String address;

    @SerializedName("phone")
    private String phone;

    @SerializedName("email")
    private String email;

    @Override
    public String toString() {
        return id + " - " + name + " - " + birthday + " - " + gender +
                " - " + address + " - " + phone + " - " + email;
    }


}
