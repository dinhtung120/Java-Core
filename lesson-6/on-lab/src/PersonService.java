import java.awt.*;
import java.util.Scanner;

public class PersonService {
    public Person[] getAllPerson() {
        Person[] persons = new Person[3];
        persons[0] = new Person(1, "Tùng", 27, Gender.MALE, "HB");
        persons[1] = new Person(2, "Tùng2", 28, Gender.MALE, "HB");
        persons[2] = new Person(3, "Tùng3", 29, Gender.MALE, "HB");
        return persons;
    }

    public void show(Person[] persons) {
        for (Person p : persons) {
            System.out.println(p);
        }
    }


    public Person createPerson() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập ID");
        int id = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập tên ");
        String name = sc.nextLine();
        System.out.println("Nhập tuổi");
        int age = Integer.parseInt(sc.nextLine());
        System.out.println("Lựa chọn giới tính");
        System.out.println("Chọn 1 - Nữ");
        System.out.println("Chọn 2 - Nam");
        int choice = Integer.parseInt(sc.nextLine());
        Gender gender = Gender.MALE;
        if (choice == 1) {
            gender = Gender.FEMALE;
        } else if (choice == 2) {
            gender = Gender.MALE;

        } else {
            System.out.println("Không có lựa chọn này");
        }

        System.out.println("Nhập địa chỉ");
        String address = sc.nextLine();

        Person newperson = new Person(id, name, age, gender, address);
        return newperson;
    }

    public Person[] addPerson(int size) {
        Person[] person = new Person[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Nhập thông tin người thử" + i);
            person[i] = createPerson();
        }
        return person;
    }

}

