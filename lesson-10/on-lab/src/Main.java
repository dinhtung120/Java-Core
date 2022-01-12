import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
//        Person p1 = new Person("John",25,"American");
//        System.out.println(p1);

        ArrayList<Person> list = new ArrayList<>();
        list.add(new Person("John", 25, "American"));
        list.add(new Person("Anna", 24, "American"));
        list.add(new Person("Chris", 23, "American"));
        list.add(new Person("Tom", 19, "American"));
        list.add(new Person("Victor", 20, "American"));

        System.out.println("    Danh sách ban đầu: ");
        show(list);

//        Collections.sort(list);
//        System.out.println("    Danh sách sau khi sắp xếp");
//        show(list);

        //danh sách sắp xếp theo tên
        Collections.sort(list, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
        System.out.println("    Danh sách sắp xếp theo tên");
        show(list);

        //danh sách sắp xếp theo tuổi
        Collections.sort(list, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getAge() - o2.getAge();
            }
        });

        System.out.println("    Danh sách sắp xếp theo tuổi");
        show(list);
    }







    public static void show(ArrayList<Person> list) {
        for (Person p : list) {
            System.out.println(p);
        }
    }
}

