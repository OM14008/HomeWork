package Class22;

public class Dog extends Animal {
    Dog(String name,String color,String breed ){
        super(name,color,breed);
    }
    @Override
    void speak(){
        System.out.println("dog woof...woof...");
    }
    @Override
    void eat(){
        System.out.println("dog likes to bite bones");
    }
    @Override
    void sleep(){
        System.out.println("dog sleeps 12H ");
    }
}
