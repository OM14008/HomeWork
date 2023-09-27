package Class22;

public class Horse extends Animal{
    Horse(String name,String color,String breed ){
        super(name,color,breed);
    }
    @Override
    void speak(){
        System.out.println("horse neigh...neigh...");
    }
    @Override
    void eat(){
        System.out.println("horse likes grass");
    }
    @Override
    void sleep(){
        System.out.println("horse sleeps 2H ");
    }
}
