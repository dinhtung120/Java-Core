public class Main {
    public static void main(String[] args) {
//        Animal cat = new Animal();
//        cat.name = "Mèo";
//        cat.age = 2;
//        cat.leg = 4;
//        cat.color = "Xám";
//
//        System.out.println(cat.name + " - " +cat.age + " - " +cat.leg + " - " +cat.color);
//        cat.eat("fish");
//
//        System.out.println(cat);
//
//        Animal dog = new Animal("Mike", 7, 4, "Black");
//        System.out.println(dog);

//        Person jane = new Person(01,"Jane",25,Gender.FEMALE,"HN");
//        Person john = new Person(02,"John",30,Gender.MALE,"HCM");
//
//        System.out.println(jane);
//        System.out.println(john);

//        Dog dog1 = new Dog("Neapolitan Mastiff",Size.Large,"black",5);
//        System.out.println(dog1);

        PersonService service = new PersonService();
        Person[] persons = service.addPerson(2);
        service.show(persons);


    }
}
