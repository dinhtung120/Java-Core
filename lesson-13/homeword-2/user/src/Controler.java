import exception.ValidateException;
import util.Gender;
import util.Menu;
import util.Validate;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class Controler {
    UserService service = new UserService();
    ArrayList<User> users = service.getAllUser();
    Scanner scanner = new Scanner(System.in);

    public void menu() {
        boolean isContinue = true;

        while (isContinue) {
            Menu.mainMenu();
            try {
                int choice = Integer.parseInt(scanner.nextLine());

                switch (choice) {
                    case 1:
                        service.show(users);
                        break;
                    case 2:
                        service.showByGender(users);
                        break;
                    case 3:
                        addUser(users);
                        break;
                    case 4:
                        System.out.println("Nhập tên khách hàng muốn tìm kiếm");
                        String searchID = scanner.nextLine();
                        searchUser(users, searchID);
                        break;
                    case 0:
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Không có lựa chọn này");

                }

            } catch (NumberFormatException e) {
                System.out.println("Bạn phải nhập số");
            }

        }

    }

    public void addUser(ArrayList<User> users) {
        String id = inputID(users);

        System.out.println("Nhập tên");
        String name = scanner.nextLine();

        LocalDate birthday = inputBirthday();
        Gender gender = inputGender();

        System.out.println("Nhập địa chỉ");
        String address = scanner.nextLine();

        String phone = inputPhone();
        String email = inputEmail();

        users.add(new User(id, name, birthday, gender, address, phone, email));

    }

    public String inputID(ArrayList<User> users) {
        boolean isContinue = true;
        String id = null;

        while (isContinue) {
            System.out.println("Nhập id");
            id = scanner.nextLine();
            for (User user : users) {
                if (user.getId().equals(id)) {
                    System.out.println("Khách hàng này đã tồn tại");
                    menu();
                }
            }
            try {
                if (Validate.validateId(id)) {
                    isContinue = false;
                }
            } catch (ValidateException e) {
                System.out.println("ID này không hợp lệ, vui lòng thử lại: ");
            }
        }
        return id;
    }

    public LocalDate inputBirthday() {
        System.out.println("Nhập ngày sinh[dd/MM/YYYY]");
        String birthday = scanner.nextLine();
        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return LocalDate.parse(birthday, df);

    }

    public Gender inputGender() {
        System.out.println("Chọn 1: Giới tính nam");
        System.out.println("Chọn 2: Giới tính nữ");
        Gender gender = null;
        int choice = Integer.parseInt(scanner.nextLine());

        if (choice == 1) {
            gender = Gender.MALE;
        } else if (choice == 2) {
            gender = Gender.FMALE;
        } else {
            System.out.println("Không có lựa chọn này");
        }
        return gender;
    }

    public String inputPhone() {
        String phone = null;
        while (phone == null) {
            System.out.println("Nhập số điện thoại");
            phone = scanner.nextLine();
            try {
                Validate.validatePhone(phone);
            } catch (ValidateException e) {
                phone = null;
                System.out.println("Số điện thoại không hợp lệ");
            }
        }
        return phone;
    }

    public String inputEmail() {
        String email = null;

        while (email == null) {
            System.out.println("Nhập email");
            email = scanner.nextLine();
            if (Validate.validateEmail(email) == true) {
                return email;
            } else {
                System.out.println("Email không hợp lệ: ");
                email = null;
            }
        }
        return email;
    }

    public User searchUser(ArrayList<User> users, String searchUser) {
        User user = null;
        for (User u : users) {
            if (u.getId().toLowerCase().equals(searchUser.toLowerCase())) {
                System.out.println(u);
                boolean isContinue = true;
                while (isContinue) {
                    System.out.println("Chọn 1: Để sửa thông tin khách hàng");
                    System.out.println("Chọn 2: Để xóa thông tin khách hàng");
                    System.out.println("Chọn 0: Để thoát tùy chọn");

                    int choice = Integer.parseInt(scanner.nextLine());
                    switch (choice) {
                        case 1:
                            changeUser(users, u);
                            break;
                        case 2:
                            deleteUser(users, u);
                            break;
                        case 0:
                            isContinue = false;
                        default:
                            System.out.println("Không có lựa chọn này");
                    }
                }

            }
        }
        if (user == null) {
            System.out.println("Không có khách hàng này");
        }
        return user;
    }

    public void deleteUser(ArrayList<User> users, User user) {
        users.remove(user);
    }

    public void changeUser(ArrayList<User> users, User user) {
        boolean isContinue = true;

        while (isContinue) {
            Menu.menuChangeUser();
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    String id = inputID(users);
                    user.setId(id);
                    break;
                case 2:
                    System.out.println("Nhập tên khách hàng");
                    String name = scanner.nextLine();
                    user.setName(name);
                    break;
                case 3:
                    LocalDate birthday = inputBirthday();
                    user.setBirthday(birthday);
                    break;
                case 4:
                    Gender gender = inputGender();
                    user.setGender(gender);
                    break;
                case 5:
                    System.out.println("Nhập địa chỉ");
                    String address = scanner.nextLine();
                    user.setAddress(address);
                    break;
                case 6:
                    String phone = inputPhone();
                    user.setPhone(phone);
                    break;
                case 7:
                    String email = inputEmail();
                    user.setEmail(email);
                    break;
                case 0:
                    menu();
                    break;
                default:
                    System.out.println("Không có lựa chọn này");


            }
        }
    }

}
