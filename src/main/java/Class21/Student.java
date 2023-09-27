package Class21;

public class Student {
    String name;
    int age;
    String ID;
    public Student(String name,int age,String ID){
        this.name=name;
        this.age=age;
        this.ID=ID;
    }
    void study(){
        System.out.println("Studying");
    }
    void rest(){
        System.out.println("resting");
    }
    void walk(){
        System.out.println("walking");
    }
}
