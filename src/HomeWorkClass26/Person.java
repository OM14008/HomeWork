package HomeWorkClass26;
public class Person {
    private String name;
    private String lastName;
    private int age;
    private double salary;
    Person(String name,String lastName,int age, double salary){
        this.name=name;
        this.lastName=lastName;
        this.age=age;
        this.salary=salary;
    }
    @Override
    public String toString() {
        return name+" "+lastName+" "+age+" "+salary;
    }
}
