public enum Unit {
    UNIT1("Đồ gia dụng"), UNIT2("Thực phẩm"), UNIT3("Thời trang");

    String value;

    Unit(String value){
        this.value = value;
    }

    public String getValue(){
        return value;
    }
}
