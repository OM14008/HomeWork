package HomeWorkClass19;

public class PrivateMethod {
    private void method2() {
        System.out.println("private method with no parameters");

    }

    void method2(String word) {
        System.out.println("non private method with one String parameter ");
    }

    void method2(int number) {
        System.out.println("non private method with int parameter");
    }

    void callPrivateMethod() {
        method2();
    }

}
