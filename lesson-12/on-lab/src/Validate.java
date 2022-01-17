public class Validate {
    public static void validateAge(int age) throws MyException {
        if (age <= 0){
            throw new MyException("tuổi không được nhỏ hơn hoặc bằng 0");
        }else {
            System.out.println("tuổi của bạn là " +age);
        }
    }
}
