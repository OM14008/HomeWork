package Class12;

public class E9StringClassDemoTask {
    public static void main(String[] args) {

        String username = "hfdslajhf";
        String password = "hfjdksa;";
        String confirmedPassword = "hfjdksa;";
        if(username.isBlank()&&password.isBlank()) {
            System.out.println("user name or password is blank");
        } else  if(username.length()<8&&password.length()<8) {
            System.out.println("user name or password less than eight characters");
        } else if(username.equals(password)) {
            System.out.println("user name and password cannot be the same");
        } else if (!password.equals(confirmedPassword)) {
            System.out.println("confirmed password not match");
        } else {
            System.out.println("signup successful");
        }

    }
}
