package CommonCodingTasks;

public class SwappingTwoNumbersWithNoTempVariable {
    public static void main(String[] args) {
        int a, b;  //swapping integer without temporary variable
        a = 3;
        b = 2;
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println(a);
        System.out.println(b);
    }
}
