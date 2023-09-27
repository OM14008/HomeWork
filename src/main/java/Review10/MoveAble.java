package Review10;

public interface MoveAble {
    void move();
}
class Dog implements MoveAble{
    @Override
    public void move(){
        System.out.println("dog is moving");
    }
}
