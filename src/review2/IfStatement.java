package review2;

public class IfStatement {
    public static void main(String[] args) {
        int age =18;

        if(age>=18) {
            System.out.println("You can get a drivers license");
        }
        String day = "Thursday";

        if(day.equals("Thursday")) {
            System.out.println("Today I have a Review class");
        } else {
            System.out.println("You are to young to drive");
        }

        String expected = "Best Sellers";

        if(expected.equals("Best Sellers")) {
            System.out.println("test passes");
        } else {
            System.out.println("Test Fail");
        }




    }
}
