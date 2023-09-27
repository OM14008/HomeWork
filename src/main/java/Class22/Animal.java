package Class22;

public abstract class Animal {
    String name;
    String color;
    String breed;

    Animal(String name,String color,String breed){
        this.name=name;
        this.color=color;
        this.breed=breed;
    }
    abstract void speak();
    abstract void eat();
    abstract void sleep();
    void printInfo(){
        System.out.println(name+" "+color+" "+breed);
    }
}
