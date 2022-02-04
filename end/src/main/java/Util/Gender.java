package Util;

public enum Gender {
    MALE("Nam"), FMALE("Nữ");

    String value;

    Gender(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
