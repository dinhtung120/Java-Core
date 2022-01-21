import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.lang.reflect.Type;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class UserService {
    Scanner scanner = new Scanner(System.in);
    public ArrayList<User> getAllUser(){
        ArrayList<User> users = new ArrayList<>();
        Gson gson = new Gson();
        try {
            FileReader reader = new FileReader("user.json");
            Type type = new TypeToken<ArrayList<User>>(){}.getType();

            users = gson.fromJson(reader,type);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return users;
    }

    public void show(ArrayList<User> users){
        for (User user: users){
            System.out.println(user);
        }
    }

    public void showByGender(ArrayList<User> users){
        System.out.println("Chọn 1: Để xem danh sách khách hàng nữ");
        System.out.println("Chọn 2: Để xem danh sách khách hàng nam");

        int choice = Integer.parseInt(scanner.nextLine());

        if (choice == 1){
            for (User user: users){
                if (user.getGender().getValue().toLowerCase().equals("nữ")){
                    System.out.println(user);
                }
            }
        }
    }
}
