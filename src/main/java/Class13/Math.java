package Class13;

public class Math {

    void add(int num1,int num2) {
        System.out.println(num1+num2);
    }
    void divide(int num1,int num2){
        System.out.println(num1/num2);
    }
    void multiply(int num1,int num2){
        System.out.println(num1*num2);
    }
    public static void main(String[] args) {
        Math math = new Math();
        math.add(10,10);
        math.divide(25,5);
        math.multiply(12,3);
    }


}
