package Review10;

public class FacebookUserTester {
    public static void main(String[] args) {
        FaceBookUser vlad = new FaceBookUser("Vlad","user123","pass123","1950-1-1");
        System.out.println(vlad.getDob());
        System.out.println(vlad.getUserName());
        vlad.setUserName("hfjelw456");
        System.out.println(vlad.getUserName());
    }
}
