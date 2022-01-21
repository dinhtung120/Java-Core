package util;

import exception.ValidateException;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validate {

    static String VALIDATEPHONE = "\\d{10,11}";

    public static boolean validatePhone(String phone) throws ValidateException {
        if (!phone.matches(VALIDATEPHONE)) throw new ValidateException("Định dạng không hợp lệ");
        else return true;
    }

    public static final Pattern VALIDATEEMAIL =
            Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);

    public static boolean validateEmail(String email) {
        Matcher matcher = VALIDATEEMAIL.matcher(email);
        return matcher.find();
    }

    static String VALIDATEID = "(KH)\\d{7}";
    public static boolean validateId(String id) throws ValidateException{
        if (!id.matches(VALIDATEID)) throw new ValidateException("Định dạng không hợp lệ");
        else return true;
    }


}
