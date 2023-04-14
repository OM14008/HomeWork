package review3;

public class LogicalOperators {
    public static void main(String[] args) {
        boolean loginButtonDisplayed=true;
        boolean loginClickable=false;

        if(loginButtonDisplayed && loginClickable) {
            System.out.println("Test passed");
        } else {
            System.out.println("Test failed");
        }
        System.out.println("------Logical OR ||---------");

        boolean pictureDisplayed=false;
        String accountName="Syntax";

        if(pictureDisplayed || accountName.equals("Syntax")) {
            System.out.println("Log in was successful");
        } else {
            System.out.println("User was not able to login");
        }

        System.out.println("------Logical NOT !--------");
        boolean hungry=!true;
        System.out.println(hungry);
        boolean cold=false;
        System.out.println(!cold);

        String str="Bye";

        if(!str.equals("Hello")) {
            System.out.println("value of the string is NOT hello");
        }
        boolean confirmSelected=true;

        if(!confirmSelected) {
            System.out.println("Let's click in confirm checkbox");
        }
        System.out.println("Click on Pay button");


    }
}
