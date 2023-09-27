package Class19;

public class Math {

    static void add(int num1,int num2){
        System.out.println(num1+num2);
    }
    static void add(int num1,double num2){
        System.out.println(num1+num2);
    }
    static void add(double num1,double num2){
        System.out.println(num1+num2);// the signature of the method has to be changed in order to have method overloading
    }
    static void add(float num1,float num2){
        System.out.println(num1+num2);//you can change the sequence of the parameters, and it will become overloaded method
    }
    static void add(double num1,double num2,int num3){
        System.out.println(num1+num2);
    }

    public static void main(String[] args) {
       add(10,10);
       add(10,20.5);
       add(10.2,3.6);
       add(1236456F,57889951F);

    }
}
