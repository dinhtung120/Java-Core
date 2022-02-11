package Util;

public class Menu {
    public static void menuHome(){
        System.out.println("---------------------------------------");
        System.out.println("Chọn 1: Để đăng nhập");
        System.out.println("Chọn 2: Để đăng ký");
        System.out.println("Chọn 0: Để thoát chương trình");
        System.out.println("Lựa chọn của bạn là: ");
    }
    public static void menuAd() {
        System.out.println("---------------------------------------");
        System.out.println("Chọn 1: Để thống kê lợi nhuận");
        System.out.println("Chọn 2: Để xem báo cáo phim");
        System.out.println("Chọn 3: Để xem tất cả giao dịch");
        System.out.println("Chọn 4: Để nạp tiền cho thành viên");
        System.out.println("Chọn 5: Để quản lý thành viên");
        System.out.println("Chọn 6: Để quản lý phim");
        System.out.println("Chọn 7: Để xem thống kê phim");
        System.out.println("Chọn 8: Để tìm phim");
        System.out.println("Chọn 0: Để đăng xuất");
        System.out.println("Lựa chọn của bạn là: ");
    }

    public static void menuUser() {
        System.out.println("---------------------------------------");
        System.out.println("Chọn 1: Để sửa thông tin");
        System.out.println("Chọn 2: Để xem lịch sử giao dịch");
        System.out.println("Chọn 3: Để xem top 5 phim thuê nhiều nhất");
        System.out.println("Chọn 4: Để xem top 5 phim download nhiều nhất");
        System.out.println("Chọn 5: Để tìm phim theo tên");
        System.out.println("Chọn 6: Để tìm phim theo thể loại");
        System.out.println("Chọn 7: Để tìm phim theo năm phát hành");
        System.out.println("Chọn 8: Để chọn phim muốn xem");
        System.out.println("Chọn 0: Để đăng xuất");
        System.out.println("Lựa chọn của bạn là: ");
    }

    public static void menuMovie() {
        System.out.println("---------------------------------------");
        System.out.println("Chọn 1: Để xem phim");
        System.out.println("Chọn 2: Để thuê phim 3 ngày");
        System.out.println("Chọn 3: Để mua phim");
        System.out.println("Chọn 4: Để báo cáo phim");
        System.out.println("Chọn 0: Để chọn phim khác");
        System.out.println("Lựa chọn của bạn là: ");

    }


    public static void menuChangeMovie(){
        System.out.println("---------------------------------------");
        System.out.println("Chọn 1: Để thay đổi tên phim");
        System.out.println("Chọn 2: Để thay đổi năm phát hành phim");
        System.out.println("Chọn 3: Để thay đổi thể loại phim");
        System.out.println("Chọn 4: Để thay đổi độ dài phim");
        System.out.println("Chọn 0: Để quay lại menu chính");
        System.out.println("Lựa chọn của bạn là: ");
    }

    public static void menuChangeUser(){
        System.out.println("---------------------------------------");
        System.out.println("Chọn 1: Để thay đổi tên người dùng");
        System.out.println("Chọn 2: Để thay đổi giới tính");
        System.out.println("Chọn 3: Để thay đổi ngày sinh");
        System.out.println("Chọn 4: Để thay đổi email");
        System.out.println("Chọn 5: Để thay đổi password");
        System.out.println("Chọn 0: Để quay lại menu chính");
        System.out.println("Lựa chọn của bạn là: ");
    }

    public static void manageMovie(){
        System.out.println("---------------------------------------");
        System.out.println("Chọn 1: Để thêm phim mới");
        System.out.println("Chọn 2: Để sửa thông tin phim");
        System.out.println("Chọn 3: Để xóa phim");
        System.out.println("Chọn 4: Để xem tất cả phim");
        System.out.println("Chọn 0: Để quay lại menu chính");
        System.out.println("Lựa chọn của bạn là: ");
    }

    public static void manageUser(){
        System.out.println("---------------------------------------");
        System.out.println("Chọn 1: Để thêm thành viên mới");
        System.out.println("Chọn 2: Để sửa thông tin thành viên");
        System.out.println("Chọn 3: Để xóa thành viên");
        System.out.println("Chọn 4: Để xem tất cả thành viên");
        System.out.println("Chọn 0: Để quay lại menu chính");
        System.out.println("Lựa chọn của bạn là: ");
    }

    public static void statisticMovie(){
        System.out.println("---------------------------------------");
        System.out.println("Chọn 1: Để xem tất cả các phim");
        System.out.println("Chọn 2: Để xem top 5 phim thuê nhiều nhất");
        System.out.println("Chọn 3: Để xem top 5 phim download nhiều nhất");
        System.out.println("Chọn 0: Để quay lại menu chính");
        System.out.println("Lựa chọn của bạn là: ");
    }

    public static void searchMovie() {
        System.out.println("---------------------------------------");
        System.out.println("Chọn 1: Để tìm phim theo tên");
        System.out.println("Chọn 2: Để tìm phim theo thể loại");
        System.out.println("Chọn 3: Để tìm phim theo năm phát hành");
        System.out.println("Chọn 0: Để quay lại menu chính");
        System.out.println("Lựa chọn của bạn là: ");
    }
}
