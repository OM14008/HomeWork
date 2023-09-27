package Class17;

public class Task1Tester {
    public static void main(String[] args) {
        Person person = new Person(16,50.3);
        Person person1= new Person();
        System.out.println(person1.drink("John",21));
        boolean k = Person.drink("Anna",18);
        System.out.println(k);
    }
}
