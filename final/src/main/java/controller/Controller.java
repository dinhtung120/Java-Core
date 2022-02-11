package controller;

import Util.*;
import exception.ValidateException;
import model.*;
import model.RentMovie;
import service.*;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Controller {

    Scanner scanner = new Scanner(System.in);

    MovieService movieService = new MovieService();
    UserService userService = new UserService();
    TransactionService transactionService = new TransactionService();
    ReportMovieService reportMovieService = new ReportMovieService();
    RentMovieService rentMovieService = new RentMovieService();

    ArrayList<Movie> movies = movieService.getAllMovie();
    ArrayList<User> users = userService.getAllUser();
    ArrayList<TransactionHistory> transactionHistories = transactionService.getTransactionHistory();
    ArrayList<ReportMovie> reportMovies = reportMovieService.getReportMovie();
    ArrayList<RentMovie> rentMovies = rentMovieService.getRentMovie();

    public void show(ArrayList<?> list) {
        for (Object o : list) {
            System.out.println(o);
        }
    }

    public void menuHome() {
        boolean isContinue = true;
        while (isContinue) {
            Menu.menuHome();
            try {
                int choice = Integer.parseInt(scanner.nextLine());
                switch (choice) {
                    case 1:
                        menuLogin();
                        break;
                    case 2:
                        addUser(users);
                        break;
                    case 0:
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Không có lựa chọn này");
                }
            } catch (NumberFormatException e) {
                System.out.println("Bạn phải nhập số ");
            }

        }
    }

    public void menuLogin() {
        User user = login();

        if (user.getZone() == Zone.A || user.getZone() == Zone.B) {
            System.out.println("Xin chào " + user);
            menuAdmin();
        } else {
            System.out.println("Xin chào " + user);
            menuUser(user);
        }
    }

    public void menuAdmin() {
        boolean isContinue = true;
        while (isContinue) {
            Menu.menuAd();
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    profitMovie(movies);
                    break;
                case 2:
                    show(reportMovies);
                    break;
                case 3:
                    show(transactionHistories);
                    break;
                case 4:
                    addMoney(users);
                    break;
                case 5:
                    manageUser(users);
                    break;
                case 6:
                    manageMovie(movies);
                    break;
                case 7:
                    statisticMovie(movies);
                    break;
                case 8:
                    searchMovie(movies);
                    break;
                case 0:
                    menuHome();
                    break;
                default:
                    System.out.println("Không có lựa chọn này");
            }
        }

    }


    public void menuUser(User user) {
        boolean isContinue = true;
        while (isContinue) {
            Menu.menuUser();
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    changeUser(user);
                    break;
                case 2:
                    transactionHistory(transactionHistories, user);
                    break;
                case 3:
                    top5rent(movies);
                    break;
                case 4:
                    top5download(movies);
                    break;
                case 5:
                    searchByTitle(movies);
                    break;
                case 6:
                    searchByCategory(movies);
                    break;
                case 7:
                    searchByYear(movies);
                    break;
                case 8:
                    choiceMovie(user);
                    break;
                case 0:
                    menuHome();
                    break;
                default:
                    System.out.println("Không có lựa chọn này");
            }
        }
    }

    public User login() {
        User user = null;
        while (user == null) {
            System.out.println("Nhập số điện thoại: ");
            String phone = scanner.nextLine();
            System.out.println("Nhập mật khẩu: ");
            String password = scanner.nextLine();
            user = userService.checkLogin(phone, password, users);

            if (user == null) {
                System.out.println("Sai số điện thoại hoặc mật khẩu");
                System.out.println("Vui lòng thử lại");
            }
        }
        return user;
    }

    public void statisticMovie(ArrayList<Movie> movies) {
        boolean isContinue = true;
        while (isContinue) {
            Menu.statisticMovie();
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    show(movies);
                    break;
                case 2:
                    top5rent(movies);
                    break;
                case 3:
                    top5download(movies);
                    break;
                case 0:
                    menuAdmin();
                    break;
                default:
                    System.out.println("Không có lựa chọn này");
            }
        }
    }

    public void searchMovie(ArrayList<Movie> movies) {
        boolean isContinue = true;
        while (isContinue) {
            Menu.searchMovie();
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    searchByTitle(movies);
                    break;
                case 2:
                    searchByCategory(movies);
                    break;
                case 3:
                    searchByYear(movies);
                    break;
                case 0:
                    menuAdmin();
                    break;
                default:
                    System.out.println("Không có lựa chọn này");
            }
        }
    }

    public void manageMovie(ArrayList<Movie> movies) {
        boolean isContinue = true;
        while (isContinue) {
            Menu.manageMovie();
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    addMovie(movies);
                    break;
                case 2:
                    changeMovie(movies);
                    break;
                case 3:
                    deleteMovie(movies);
                    break;
                case 4:
                    show(movies);
                    break;
                case 0:
                    menuAdmin();
                    break;
                default:
                    System.out.println("Không có lựa chọn này");
            }
        }
    }

    public void manageUser(ArrayList<User> users) {
        boolean isContinue = true;
        while (isContinue) {
            Menu.manageUser();
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    addUser(users);
                    break;
                case 2:
                    changeUserAdmin(users);
                    break;
                case 3:
                    deleteUser(users);
                    break;
                case 4:
                    show(users);
                    break;
                case 0:
                    menuAdmin();
                    break;
                default:
                    System.out.println("Không có lựa chọn này");
            }
        }
    }

    public void choiceMovie(User user) {
        checkRentMovie();
        Movie movie = selectionMovie();
        Menu.menuMovie();
        int choice = Integer.parseInt(scanner.nextLine());
        switch (choice) {
            case 1:
                playMovie(movie,user);
                break;
            case 2:
                rentMovie(movie, user);
                break;
            case 3:
                buyMovie(movie, user);
                break;
            case 4:
                report(movie, user);
                break;
            case 0:
                menuUser(user);
                break;
            default:
                System.out.println("Không có lựa chọn này");
        }
    }

    public void profitMovie(ArrayList<Movie> movies) {
        long rentProfit = 0;
        long buyProfit = 0;

        for (Movie movie : movies) {
            rentProfit = movie.getRents() * movie.getRentMovie();
            buyProfit = movie.getDownloads() * movie.getBuyMovie();
        }
        System.out.println("Số tiền kiếm được từ việc thuê phim là : " + Util.formatMoney(rentProfit));
        System.out.println("Số tiền kiếm được từ việc tải phim là : " + Util.formatMoney(buyProfit));
        System.out.println("Tổng lợi nhuận là : " + Util.formatMoney(rentProfit + buyProfit));
    }

    public void addMovie(ArrayList<Movie> movies) {
        String id = randomIdMovie();
        String title = inputTitleMovie();
        int releaseYear = inputReleaseYearMovie();
        String[] category = inputCategoryMovie();
        int length = inputLengthMovie();
        long rentMovie = inputRentMovie();
        long buyMovie = inputBuyMovie();

        movies.add(new Movie(id, title, releaseYear, category, length, 0, 0, rentMovie, buyMovie));
    }

    public void addUser(ArrayList<User> users) {
        String id = randomIdUser();
        String name = inputName();
        Gender gender = inputGender();
        LocalDate birthday = inputBirthday();
        String phone = newPhone(users);
        String email = inputEmail();
        String password = inputPassword();

        users.add(new User(id, name, gender, 0, birthday, phone, email, password, Zone.D));
    }

    public void changeMovie(ArrayList<Movie> movies) {
        String id = inputIdMovie();
        for (Movie movie : movies) {
            if (movie.getId().equals(id)) {
                System.out.println(movie);
                boolean isContinue = true;
                while (isContinue) {
                    Menu.menuChangeMovie();
                    int choice = Integer.parseInt(scanner.nextLine());
                    switch (choice) {
                        case 1:
                            String title = inputTitleMovie();
                            movie.setTitle(title);
                            break;
                        case 2:
                            int year = inputReleaseYearMovie();
                            movie.setReleaseYear(year);
                            break;
                        case 3:
                            String[] category = inputCategoryMovie();
                            movie.setCategory(category);
                            break;
                        case 4:
                            int length = inputLengthMovie();
                            movie.setLength(length);
                            break;
                        case 0:
                            isContinue = false;
                            break;
                        default:
                            System.out.println("Không có lựa chọn này");

                    }
                }
            }
        }
    }

    public void changeUserAdmin(ArrayList<User> users) {
        String id = inputIdUser();
        for (User user : users) {
            if (user.getId().equals(id)) {
                System.out.println(user);
                boolean isContinue = true;
                while (isContinue) {
                    Menu.menuChangeUser();
                    int choice = Integer.parseInt(scanner.nextLine());
                    switch (choice) {
                        case 1:
                            String name = inputName();
                            user.setName(name);
                            break;
                        case 2:
                            Gender gender = inputGender();
                            user.setGender(gender);
                            break;
                        case 3:
                            LocalDate birthday = inputBirthday();
                            user.setBirthday(birthday);
                            break;
                        case 4:
                            String email = inputEmail();
                            user.setEmail(email);
                            break;
                        case 5:
                            String password = inputPassword();
                            user.setPassword(password);
                            break;
                        case 0:
                            isContinue = false;
                            break;
                        default:
                            System.out.println("Không có lựa chọn này");

                    }
                }
            }
        }
    }

    public void deleteMovie(ArrayList<Movie> movies) {
        String id = inputIdMovie();
        movies.removeIf(movie -> movie.getId().equals(id));

    }

    public void deleteUser(ArrayList<User> users) {
        String id = inputIdUser();
        users.removeIf(user -> user.getId().equals(id));
    }

    public void addMoney(ArrayList<User> users) {
        String id = inputIdUser();
        System.out.println("Nhập số tiền cần nạp");
        long money = Long.parseLong(scanner.nextLine());


        for (User user : users) {
            if (user.getId().equals(id)) {
                long newMoney = user.getBalance() + money;
                user.setBalance(newMoney);
                transactionHistories.add(new TransactionHistory(id, Transaction.DEPOSIT, money));
            }
        }
    }

    public void top5rent(ArrayList<Movie> movies) {
        movies.stream().sorted((o1, o2) -> o2.getRents() - o1.getRents())
                .limit(5).forEach(movie -> System.out.println(movie));
    }

    public void top5download(ArrayList<Movie> movies) {
        movies.stream().sorted((o1, o2) -> o2.getDownloads() - o1.getDownloads())
                .limit(5).forEach(movie -> System.out.println(movie));
    }


    public void searchByTitle(ArrayList<Movie> movies) {
        System.out.println("Nhập tên phim cần tìm kiếm: ");
        String title = scanner.nextLine();
        movies.stream().filter(movie -> movie.getTitle().toLowerCase().contains(title.toLowerCase()))
                .forEach(movie -> System.out.println(movie));

    }

    public void searchByCategory(ArrayList<Movie> movies) {
        System.out.println("Nhập thể loại phim cần tìm kiếm: ");
        String category = scanner.nextLine();
        movies.stream().filter(movie -> Arrays.toString(movie.getCategory()).toLowerCase().contains(category.toLowerCase()))
                .forEach(movie -> System.out.println(movie));

    }

    public void searchByYear(ArrayList<Movie> movies) {
        System.out.println("Nhập năm phim cần tìm kiếm: ");
        int year = Integer.parseInt(scanner.nextLine());
        movies.stream().filter(movie -> movie.getReleaseYear() == year)
                .forEach(movie -> System.out.println(movie));

    }


    public String newPhone(ArrayList<User> users) {
        String phone = null;
        while (phone == null) {
            phone = inputPhone();
            for (User user : users) {
                if (user.getPhone().equals(phone)) {
                    System.out.println("Số điện thoại này đã tồn tại");
                    phone = null;
                }
            }
        }
        return phone;
    }

    public void changeUser(User user) {
        boolean isContinue = true;
        while (isContinue) {
            Menu.menuChangeUser();
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    String name = inputName();
                    user.setName(name);
                    break;
                case 2:
                    Gender gender = inputGender();
                    user.setGender(gender);
                    break;
                case 3:
                    LocalDate birthday = inputBirthday();
                    user.setBirthday(birthday);
                    break;
                case 4:
                    String email = inputEmail();
                    user.setEmail(email);
                    break;
                case 5:
                    String password = inputPassword();
                    user.setPassword(password);
                    break;
                case 0:
                    isContinue = false;
                    break;
                default:
                    System.out.println("Không có lựa chọn này");
            }
        }
    }

    public void transactionHistory(ArrayList<TransactionHistory> transactionHistories, User user) {
        transactionHistories.stream()
                .filter(transactionHistory -> transactionHistory.getIdUser().equals(user.getId()))
                .forEach(transactionHistory -> System.out.println(transactionHistory));
    }

    public void report(Movie movie, User user) {
        String idUser = user.getId();
        String idMovie = movie.getId();
        String title = movie.getTitle();

        System.out.println("Nhập thông tin lỗi");
        String content = scanner.nextLine();

        reportMovies.add(new ReportMovie(idUser, idMovie, title, LocalDate.now(), content));
    }

    public void rentMovie(Movie movie, User user) {
        String idUser = user.getId();
        String idMovie = movie.getId();
        String title = movie.getTitle();
        int rent = movie.getRents();

        rent(movie, user);
        movie.setRents(rent + 1);
        rentMovies.add(new RentMovie(idUser, idMovie, title,LocalDate.now().plusDays(3)));
        transactionHistories.add(new TransactionHistory(idUser, Transaction.RENTMOVIE, movie.getRentMovie()));

    }

    public void buyMovie(Movie movie, User user) {
        String idUser = user.getId();
        String idMovie = movie.getId();
        String title = movie.getTitle();
        int download = movie.getDownloads();

        movie.setDownloads(download + 1);
        buy(movie, user);
        rentMovies.add(new RentMovie(idUser, idMovie, title,LocalDate.now().plusYears(10)));
        transactionHistories.add(new TransactionHistory(idUser, Transaction.BUYMOVIE, movie.getBuyMovie()));
    }

    public void playMovie(Movie movie, User user){
        rentMovies.stream().filter(rentMovie -> rentMovie.getIdUser().equals(user.getId()))
                .filter(rentMovie -> rentMovie.getIdMovie().equals(movie.getId()))
                .forEach(rentMovie -> System.out.println("Link xem phim"));
    }

    public void checkRentMovie(){
        rentMovies.removeIf(rentMovie -> rentMovie.getDate().isBefore(LocalDate.now()));
    }

    public void rent(Movie movie, User user) {
        long balance = user.getBalance();
        long money = movie.getRentMovie();

        if (balance < money) {
            System.out.println("Tài khoản không đủ tiền để thực hiện giao dịch này");
        } else {
            user.setBalance(balance - money);
        }
    }

    public void buy(Movie movie, User user) {
        long balance = user.getBalance();
        long money = movie.getBuyMovie();

        if (balance < money) {
            System.out.println("Tài khoản không đủ tiền để thực hiện giao dịch này");
        } else {
            user.setBalance(balance - money);
        }
    }

    public Movie selectionMovie() {
        Movie movie = null;
        while (movie == null) {
            String idMovie = inputIdMovie();
            movie = movieService.checkMovie(idMovie, movies);
            if (movie == null) {
                System.out.println("Sai ID phim, vui lòng thử lại");
            }
        }
        return movie;
    }


    public String randomIdMovie() {
        String idMovie = null;
        while (idMovie == null) {
            idMovie = "MO" + Util.randomNumber(6);
            for (Movie movie : movies) {
                if (idMovie.equals(movie.getId())) {
                    idMovie = null;
                    break;
                }
            }
        }
        return idMovie;
    }

    public String randomIdUser() {
        String id = null;
        while (id == null) {
            id = "U" + Util.randomNumber(6);
            for (Movie movie : movies) {
                if (id.equals(movie.getId())) {
                    id = null;
                    break;
                }
            }
        }
        return id;
    }


    public String inputIdMovie() {
        String idMovie = null;
        while (idMovie == null) {
            System.out.println("Nhập ID phim: ");
            idMovie = scanner.nextLine();
            try {
                Validate.validateIdMovie(idMovie);
            } catch (ValidateException e) {
                idMovie = null;
                System.out.println("Định dạng ID của phim không hợp lệ");
            }
        }
        return idMovie;
    }

    public String inputIdUser() {
        String id = null;
        while (id == null) {
            System.out.println("Nhập ID người dùng: ");
            id = scanner.nextLine();
            try {
                Validate.validateIdUser(id);
            } catch (ValidateException e) {
                id = null;
                System.out.println("Định dạng ID của người dùng không hợp lệ");
            }
        }
        return id;
    }

    public String inputTitleMovie() {
        System.out.println("Nhập tên phim mới: ");
        return scanner.nextLine();
    }

    public int inputReleaseYearMovie() {
        System.out.println("Nhập năm phát hành phim mơi: ");
        return Integer.parseInt(scanner.nextLine());
    }

    public String[] inputCategoryMovie() {
        System.out.println("Nhập thể loại phim mới: ");
        return scanner.nextLine().split(",");
    }

    public int inputLengthMovie() {
        System.out.println("Nhập độ dài phim mới (phút): ");
        return Integer.parseInt(scanner.nextLine());
    }

    public long inputRentMovie() {
        System.out.println("nhập giá cho thuê phim mới: ");
        return Long.parseLong(scanner.nextLine());
    }

    public long inputBuyMovie() {
        System.out.println("Nhập giá download phim mới: ");
        return Long.parseLong(scanner.nextLine());
    }

    public String inputName() {
        System.out.println("Nhập tên người dùng mới: ");
        return scanner.nextLine();
    }

    public String inputPassword() {
        System.out.println("Nhập mật khẩu mới: ");
        return scanner.nextLine();
    }

    public Gender inputGender() {
        System.out.println("Chọn 1: Giới tính nam");
        System.out.println("Chọn 2: Giới tính nữ");
        Gender gender = null;
        while (gender == null) {
            int choice = Integer.parseInt(scanner.nextLine());

            if (choice == 1) {
                gender = Gender.MALE;
            } else if (choice == 2) {
                gender = Gender.FMALE;
            } else {
                System.out.println("Không có lựa chọn này, mời nhập lại: ");
                System.out.println("Chọn 1: Giới tính nam");
                System.out.println("Chọn 2: Giới tính nữ");
            }
        }
        return gender;
    }

    public LocalDate inputBirthday() {
        System.out.println("Nhập ngày sinh[dd/MM/YYYY]");
        String birthday = scanner.nextLine();
        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return LocalDate.parse(birthday, df);
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
            if (Validate.validateEmail(email)) {
                return email;
            } else {
                System.out.println("Email không hợp lệ: ");
                email = null;
            }
        }
        return email;
    }
}
