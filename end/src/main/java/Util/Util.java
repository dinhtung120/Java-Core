package Util;

import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Random;

public class Util {

    private static final String alpha = "abcdefghijklmnopqrstuvwxyz"; //a-z
    private static final String alphaUpperCase = alpha.toUpperCase(); //A-Z
    private static final String digits = "0123456789"; //0-9
    private static final String specials = "~=+%^*/()[]{}/!@#$?|";
    private static final String ALPHA_NUMERIC = alpha + alphaUpperCase + digits;
    private static final String ALL = alpha + alphaUpperCase + digits + specials;

    private static Random generator = new Random();

    public static int randomNumber(int min, int max) {
        return generator.nextInt(max - min) + min;
    }

    //Random string with a-z A-Z 0-9, not included special characters

    public static String randomId(int numberOfCharactor) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < numberOfCharactor; i++) {
            int number = randomNumber(0, ALPHA_NUMERIC.length() - 1);
            char ch = ALPHA_NUMERIC.charAt(number);
            sb.append(ch);
        }
        return sb.toString();
    }

    public static String randomNumber(int numberOfCharactor) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < numberOfCharactor; i++) {
            int number = randomNumber(0, digits.length() - 1);
            char ch = digits.charAt(number);
            sb.append(ch);
        }
        return sb.toString();
    }

    public static String formatMoney(long money) {
        String pattern = "###,###,###.00";
        DecimalFormat myFormat = new DecimalFormat(pattern);
        return myFormat.format(money);
    }

    public static String formatDate(LocalDate date) {
        DateTimeFormatter myFormat = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return date.format(myFormat);
    }
}
