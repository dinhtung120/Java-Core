import java.util.ArrayList;
import java.util.Scanner;

public class Controler {
    static Scanner scanner = new Scanner(System.in);
    static Team team = new Team();
    static ArrayList<Player> players = team.getAllTeam();

    public static void menu() {
        System.out.println("----------------------------------");
        System.out.println("    Chọn đội hình bạn mong muốn: ");
        System.out.println("Chọn 1: 1GK - 4DF - 4MF - 2FW");
        System.out.println("Chọn 2: 1GK - 4DF - 3MF - 3FW");
        System.out.println("Chọn 3: 1GK - 3DF - 5MF - 2FW");
        System.out.println("Chọn 0: Để thoát chương trình");
    }

    public static void mainMenu() {
        boolean isContinue = true;

        while (isContinue) {
            menu();
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    int df1 = 4;
                    int fw1 = 4;
                    int mf1 = 2;
                    ArrayList<Player> choiceTeam1 = team.buildTeam(df1, fw1, mf1, players);
                    System.out.println("Đội hình đã chọn cho bạn là:");
                    team.show(choiceTeam1);
                    break;
                case 2:
                    int df2 = 4;
                    int fw2 = 3;
                    int mf2 = 3;
                    ArrayList<Player> choiceTeam2 = team.buildTeam(df2, fw2, mf2, players);
                    System.out.println("Đội hình đã chọn cho bạn là:");
                    team.show(choiceTeam2);
                    break;
                case 3:
                    int df3 = 3;
                    int fw3 = 5;
                    int mf3 = 2;
                    ArrayList<Player> choiceTeam3 = team.buildTeam(df3, fw3, mf3, players);
                    System.out.println("Đội hình đã chọn cho bạn là:");
                    team.show(choiceTeam3);
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Không có lựa chọn này");

            }
        }
    }
}
