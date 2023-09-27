package Class22;

public class Cat extends Animal {
    Cat(String name,String color,String breed ){
        super(name,color,breed);
    }
    @Override
    void speak(){
        System.out.println("cat meaw...meaw...");
    }
    @Override
    void eat(){
        System.out.println("cat likes fish");
    }
    @Override
    void sleep(){
        System.out.println("cat sleeps 10H ");
    }

}
