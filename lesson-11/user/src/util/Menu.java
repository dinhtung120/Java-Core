package util;

public class Menu {
    public static void mainMenu(){
        System.out.println("----------------------------------");
        System.out.println("Chọn 1: Đăng nhập");
        System.out.println("Chọn 2: Đăng ký");
        System.out.println("Chọn 0: Để thoát chương trình");
        System.out.println("Lựa chọn của bạn là: ");
    }

    public static void loginSuccessMenu(){
        System.out.println("----------------------------------");
        System.out.println("Chọn 1: Thay đổi username");
        System.out.println("Chọn 2: Thay đổi email");
        System.out.println("Chọn 3: Thay đổi mật khẩu");
        System.out.println("Chọn 4: Đăng xuất");
        System.out.println("Chọn 0: Để thoát chương trình");
        System.out.println("Lựa chọn của bạn là: ");
    }

    public static void loginFail(){
        System.out.println("----------------------------------");
        System.out.println("Chọn 1: Đăng nhập lại");
        System.out.println("Chọn 2: Quên mật khẩu");
        System.out.println("Chọn 0: Để thoát chương trình");
        System.out.println("Lựa chọn của bạn là: ");
    }
}
