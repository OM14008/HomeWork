package CommonCodingTasks;

public class SwappingTwoNumbersWithNoTempVariable {
    public static void main(String[] args) {
        int a, b, c;
        a = 3;
        b = 2;
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println(a);
        System.out.println(b);

        //Swapping Strings without temporary variable
        String x = "Hello";
        String y = "Welcome";
        x = x + y; //HelloWelcome
        y=x.substring(0,x.length()-y.length());
        x=x.substring(y.length());
        System.out.println(x);
        System.out.println(y);
        System.out.println();
    }
}
