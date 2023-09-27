package Class16;

public class Person {
    String name="Vlad";
    String SSN = "456853";
    private String password;
    static double bankBalance=120000;

    void printPassword(){
        System.out.println(password);
    }
    private static void printBalance(){
        System.out.println(bankBalance);
    }
    public static void main(String[] args) {
        Person Farwa=new Person();
        Farwa.password="124563";
        Farwa.printPassword();
        System.out.println(Person.bankBalance);
        System.out.println(Farwa.SSN);

    }
}

