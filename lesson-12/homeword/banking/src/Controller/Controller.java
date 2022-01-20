package Controller;

import exception.ValidateException;
import model.Account;
import model.TransactionHistory;
import service.AccountService;
import service.TransactionHistoryService;
import util.Menu;
import util.Util;
import util.Validate;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Controller {
    Scanner scanner;
    AccountService accountService;
    TransactionHistoryService transactionHistoryService;
    ArrayList<Account> accounts;
    ArrayList<TransactionHistory> transactionHistories;

    public Controller() {
        scanner = new Scanner(System.in);
        accountService = new AccountService();
        transactionHistoryService = new TransactionHistoryService();
        accounts = accountService.getAllAccount();
        transactionHistories = transactionHistoryService.getAllTransactionHistory();
    }

    public void home() {
        Account account = login();

        boolean isContinue = true;
        while (isContinue){
            Menu.menu();
            int choice = Integer.parseInt(scanner.nextLine());

            switch (choice){
                case 1:
                    getBalance(account);
                    break;
                case 2:
                    transferHandling(account);
                    break;
                case 3:
                    getAllTransactionHistory(account);
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Không có lựa chọn này");

            }
        }

    }

    public Account login() {
        Account account = null;
        while (account == null) {
            System.out.println("Nhập số điện thoại: ");
            String mobile = scanner.nextLine();
            System.out.println("Nhập mật khẩu: ");
            String password = scanner.nextLine();
            account = accountService.checkLogin(mobile, password, accounts);

            if (account == null) {
                System.out.println("Sai số điện thoại hoặc mật khẩu");
                System.out.println("Vui lòng thử lại");
            }
        }
        return account;
    }

    public void getBalance(Account account) {
        String balance = Util.formatMoney(account.getBalance());
        System.out.println("Số dư: " + balance + " vnđ");
    }

    public void transferHandling(Account account){
        TransactionHistory newTransaction = createNewTransaction(account);
        transactionHistories.add(newTransaction);
        System.out.println("Thành công");
        System.out.println(newTransaction);
    }

    public TransactionHistory createNewTransaction(Account account) {
        System.out.println("Chọn ngân hàng muỗn gửi tiền: ");
        String bank = scanner.nextLine();

        System.out.println("Nhập số tài khoản");
        String bankAccount = inputBankAccount();

        System.out.println("Nhập số tiền cân chuyển: ");
        long money = inputMoney(account);

        System.out.println("Nhập nội dung");
        String content = scanner.nextLine();

        account.setBalance(account.getBalance() - money);

        return new TransactionHistory(account.getId(),LocalDate.now(),content, bankAccount, money);
    }

    public void getAllTransactionHistory(Account account){
        for (TransactionHistory history: transactionHistories){
            if (history.getIdAccount().equals(account.getId())){
                System.out.println(history);
            }
        }
    }

    public String inputBankAccount() {
        String bankAccount = null;
        while (bankAccount == null) {
            bankAccount = scanner.nextLine();
            try {
                Validate.validateAccount(bankAccount);
            } catch (ValidateException e) {
                bankAccount = null;
                System.out.println("Số tài khoản không hợp lệ, vui lòng thử lại");
            }
        }
        return bankAccount;
    }

    public long inputMoney(Account account) {
        long money = 0;
        while (money == 0) {
            money = Long.parseLong(scanner.nextLine());
            if (money < 50000) {
                System.out.println("Số tiền muốn chuyển phải trên 50.000 vnđ");
                money = 0;
            } else {
                if (account.getBalance() - 50000 < money) {
                    System.out.println("Số dư của bạn không đủ");
                    money = 0;
                }
            }
            if (money == 0) {
                System.out.println("Vui lòng nhập lại");
            }
        }
        return money;
    }

}
