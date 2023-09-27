package Class14;

public class E6 {
    boolean isEven (int num1) {
        boolean isEven = false;
        if(num1%2==0) {
            isEven = true;
        }
       // return isEven;
        //  OR
        return num1%2==0;
    }

    public static void main(String[] args) {
        E6 obj = new E6();
        int number = 13;
        boolean result = obj.isEven(number);
        System.out.println(result);
        // OR
        System.out.println(obj.isEven(16));
    }
}
