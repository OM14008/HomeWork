package Class23;

public interface MoveAble {
    int age = 12;
    void move();
}
 interface WashAble{
    void wash();
}
    class Dog implements MoveAble,WashAble{
    @Override
    public void wash(){
        System.out.println("You can wash me");
    }
    @Override
    public void move(){
          System.out.println("Dog.....");
      }
    }
class Cat implements MoveAble{
    @Override
    public void move(){
        System.out.println("Cats can also move");
    }
}
class Horse implements MoveAble{
    @Override
    public void move(){
        System.out.println("Horse can also move");
    }
}
