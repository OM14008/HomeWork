package HomeWorkClass12;

import java.util.Scanner;

public class LogInPage {
    public static void main(String[] args) {

        String userName1 = "admin";
        String password1 = "admin123";
        String confirmPassword1 = "admin123";
       /* Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the username");
        String userName = scanner.next();
        System.out.println("Please enter the password");
        String password = scanner.next();
        System.out.println("Please confirm password");
        String confirmPassword = scanner.next();*/

        if(userName1.isEmpty()||password1.isEmpty()) {
            System.out.println("User name or password cannot be empty");
        } else if(password1.length()<8) {
            System.out.println("Password is to short");
        } else if(password1.equals(userName1)) {
            System.out.println("Password cannot contain username");
        } else if(!password1.equals(confirmPassword1)) {
            System.out.println("Password do not match");
        } else {
            System.out.println("Your username and password has been created");
        }






    }
}
