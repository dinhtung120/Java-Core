package controller;

import model.User;
import service.UserService;
import util.Menu;
import util.Validate;

import java.util.ArrayList;
import java.util.Scanner;

public class UserController {
    Scanner scanner;
    UserService service;
    ArrayList<User> users;

    public UserController() {
        scanner = new Scanner(System.in);
        service = new UserService();
        users = service.getAllUser();
    }

    public void home() {
        boolean isContinue = true;
        while (isContinue) {
            Menu.mainMenu();
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    login();
                    break;
                case 2:
                    createNewAccount();
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Không có lựa chọn này");
            }
        }
    }

    public void login() {
        System.out.println("Nhập username");
        String username = scanner.nextLine();
        System.out.println("Nhập password");
        String password = scanner.nextLine();

        boolean isValidUsername = false;
        while (!isValidUsername) {
            for (User user : users) {
                if (user.getUsername().equals(username)) {
                    isValidUsername = true;
                    if (user.getPassword().equals(password)) {
                        loginSuccess(user);
                    } else {
                        System.out.println("Mật khẩu không chính xác");
                        loginFail();
                    }
                }
            }
            if (!isValidUsername) {
                System.out.println("Kiểm tra lại username");
                home();
            }
        }
    }

    public void loginSuccess(User user) {
        System.out.println("Chào mừng " + user.getUsername() + ", bạn có thể thực hiện các việc sau");
        boolean isContinue = true;
        while (isContinue) {
            Menu.loginSuccessMenu();
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    changeUsername(user);
                    break;
                case 2:
                    changeEmail(user);
                    break;
                case 3:
                    changePassword(user);
                    break;
                case 4:
                    isContinue = false;
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Không có lựa chọn này");
            }
        }
    }

    public void loginFail() {
        while (true){
            Menu.loginFail();
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1:
                    login();
                    break;
                case 2:
                    forgotPassword();
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Không có lựa chọn này");
            }
        }
    }

    public String checkUsername() {
        boolean isValidUsername = false;
        String username = null;
        while (!isValidUsername) {
            System.out.println("Nhập username: ");
            username = scanner.nextLine();
            for (User user : users) {
                if (user.getUsername().equals(username)) {
                    System.out.println("Username đã tồn tại");
                    checkUsername();
                } else {
                    isValidUsername = true;
                }
            }
        }
        return username;
    }

    public String checkEmail() {
        boolean isValidEmail = true;
        String email = null;
        while (isValidEmail) {
            System.out.println("Nhập email: ");
            email = scanner.nextLine();
            if (!Validate.validateEmail(email)) {
                System.out.println("Email không hợp lệ");
            } else {
                for (User user : users) {
                    if (user.getEmail().equals(email)) {
                        System.out.println("Email đã tồn tại");
                        checkEmail();
                    } else {
                        isValidEmail = false;
                    }
                }
            }
        }
        return email;
    }

    public String checkPassword() {
        boolean isValidPassword = false;
        String password = null;
        while (!isValidPassword) {
            System.out.println("Nhập mật khẩu: ");
            password = scanner.nextLine();
            if (Validate.validatePassword(password)) {
                System.out.println("Mật khẩu không hợp lệ");
            } else {
                isValidPassword = true;
            }
        }
        return password;
    }

    public void createNewAccount() {
        String username = checkUsername();
        String email = checkEmail();
        String password = checkPassword();

        users.add(new User(username, email, password));
        System.out.println("Đăng ký thành công");
    }

    public void forgotPassword() {
        boolean isRightEmail = false;
        while (!isRightEmail) {
            System.out.println("Nhập email của bạn");
            String email = scanner.nextLine();
            User user = service.checkEmail(users, email);
            if (user != null) {
                isRightEmail = true;
                user.setPassword(checkPassword());
            }else {
                System.out.println("Chưa tồn tại tài khoản này");
            }
        }
        System.out.println("cập nhật mật khẩu thành công");
        login();
    }

    public void changeUsername(User user) {
        user.setUsername(checkUsername());
        System.out.println("Thông tin sau khi cập nhật: ");
        System.out.println(user);
    }

    public void changeEmail(User user) {
        user.setEmail(checkEmail());
        System.out.println("Thông tin sau khi cập nhật: ");
        System.out.println(user);
    }

    public void changePassword(User user) {
        user.setPassword(checkPassword());
        System.out.println("Thông tin sau khi cập nhật: ");
        System.out.println(user);
    }

}
