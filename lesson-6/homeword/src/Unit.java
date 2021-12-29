public enum Unit {
    UNIT1("Chiếc"), UNIT2("Gói"), UNIT3("Thùng");

    String value;

    Unit(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
