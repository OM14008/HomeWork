package Class23;

public interface SellAble {
    int price = 12000;
    void buy();
    static void sell(){
        System.out.println("static method");
    }

}
class Tester1{
    public static void main(String[] args) {
        SellAble.sell();
    }

}
