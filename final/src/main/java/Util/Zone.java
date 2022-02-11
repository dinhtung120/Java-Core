package Util;

public enum Zone {
A("Chủ Trang"), B("Quản Lý"), C("Người dùng Vip"),
    D("Người dùng"),E("Khách");

    String value;

    Zone(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
