package Class21;

class Animal{
    String name;
    String color;
    String breed;

    public Animal(String name, String color, String breed) {
        this.name = name;
        this.color = color;
        this.breed = breed;
    }
    void printInfo(){
        System.out.println(name+" "+color+" "+breed);
    }
    void sleep(){
        System.out.println("sleeping");
    }
    void eat(){
        System.out.println("eat");
    }
    void speak(){
        System.out.println("animal speaks");
    }
 }
    class Cat extends Animal {
   public Cat(String name, String color, String breed) {
        super(name, color, breed);
    }
    @Override
    void speak(){
        System.out.println("cat goes neaw..neaw...");
    }
    @Override
    void eat(){
        System.out.println("cat likes to eat fish");
    }

        @Override
        void sleep() {
            System.out.println("cat sleeping 10H a day");
        }
    }
public class Dog extends Animal{
    public Dog(String name, String color, String breed) {
        super(name, color, breed);
    }
    @Override
    void speak(){
        System.out.println("dog goes wolf..wolf...");
    }

    @Override
    void sleep() {
        System.out.println("Dog likes to sleep 8H a day");
    }
    void run(){
        System.out.println("Dog can run fast");
    }

    @Override
    void eat() {
        System.out.println("dog likes bones");
    }
}
class Horse extends Animal{
    public Horse(String name,String color,String breed){
        super(name,color,breed);
    }

    @Override
    void eat() {
        System.out.println("horse eats grass");
    }

    @Override
    void sleep() {
        System.out.println("Horse Sleep 2H a day");
    }

    @Override
    void speak() {
        System.out.println("horse speaks neigh...neigh....");
    }
}
class AnimalTester{
    public static void main(String[] args) {
        Dog dog=new Dog("Shaggy","black","German");
        dog.printInfo();
        Animal dog1=new Dog("Snoopy","Black","German");
        dog1.printInfo();

        Animal[] animals = {new Horse("Brady","Black","English"),dog,dog1,new Cat("Tom","Blue","Persian") };
    }
}
