package Review8;

public class ConstructorExample {
    ConstructorExample(){
        System.out.println("I created this constructor");
    }
    ConstructorExample(String str){
        System.out.println("I'm parametrized constructor");
    }
    public static void main(String[] args) {
        new ConstructorExample();
        new ConstructorExample("Hello");
    }

}
