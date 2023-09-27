package Class14;

public class E7 {
    void isLarger(int num1,int num2) {
        if(num1>num2) {
            System.out.println(num1+" greater then "+num2);
        } else {
            System.out.println(num1+" less then "+num2);
        }
    }
    public static void main(String[] args) {
        E7 obj = new E7();
        obj.isLarger(12,13);
    }
}
