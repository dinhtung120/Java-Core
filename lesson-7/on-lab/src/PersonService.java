public class PersonService {
    public static void createPerson(){
        Person person = new Person("Vũ",30,"HB");
        System.out.println(person);
        person.setName("Tùng");
        System.out.println(person);
        System.out.println(person.getName());
    }
}
