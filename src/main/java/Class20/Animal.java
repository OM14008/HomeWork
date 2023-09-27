package Class20;

public class Animal {
    String name;
    String color;
    String breed;
    int age;
    double weight;

    Animal(String name,String color,String breed,int age,double weight){
        this.name=name;
        this.color=color;
        this.breed=breed;
        this.age=age;
        this.weight=weight;
    }

    void sleep(){
        System.out.println("sleeping");
    }
    void run(){
        System.out.println("running");
    }
    void eat(){
        System.out.println("eating");
    }
    void drink(){
        System.out.println("drinking");
    }
    void walk(){
        System.out.println("walking");
    }
}
