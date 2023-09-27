package Class12;

public class E2StringDemo {
    public static void main(String[] args) {

        String userName = "Adminjgkdl";
        String password = "pass123sjdjkl";
        if(userName.length()<8&&password.length()<8) {
            System.out.println("user name or password is less than eight characters");

        } else {
            System.out.println("signup successful");
        }
        String name = "marina";
        String name2 = "Axel";
        System.out.println(name.toUpperCase());
        System.out.println(name2.toLowerCase());




    }
}
