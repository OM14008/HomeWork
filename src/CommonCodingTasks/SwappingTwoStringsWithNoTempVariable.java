package CommonCodingTasks;

public class SwappingTwoStringsWithNoTempVariable {
    public static void main(String[] args) {
        //Swapping Strings without temporary variable
        String x = "Hello";
        String y = "Welcome";
        System.out.println(x);
        System.out.println(y);
        x = x + y; //HelloWelcome
        y=x.substring(0,x.length()-y.length());
        x=x.substring(y.length());
        System.out.println(x);
        System.out.println(y);


    }

}
