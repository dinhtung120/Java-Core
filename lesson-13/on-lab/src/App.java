import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student(1,"Hoa",8));
        students.add(new Student(2,"Tùng",7));
        students.add(new Student(3,"Cường",8.5));

        ArrayList<Teacher> teachers = new ArrayList<>();
        teachers.add(new Teacher(4,"Tuấn",8000000));
        teachers.add(new Teacher(5,"Long",9000000));
        teachers.add(new Teacher(6,"Hương",5000000));

        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(new Animal("Cat",4,"Black" ));
        animals.add(new Animal("Dog",4,"White" ));


        System.out.println("    Danh sách học sinh");
//        showStudent(students);
        show(students);

        System.out.println("    Danh sách giáo viên");
//        showTeacher(teachers);
        show(teachers);

        System.out.println("    Danh sách động vật");
        show(animals);



    }

    public static void showStudent(ArrayList<Student> students){
        for (Student student: students){
            System.out.println(student);
        }
    }

    public static void showTeacher(ArrayList<Teacher> teachers){
        for (Teacher teacher: teachers){
            System.out.println(teacher);
        }
    }

    public static void show(ArrayList<?> list){
        for (Object o : list){
            System.out.println(o);
        }
    }
}
