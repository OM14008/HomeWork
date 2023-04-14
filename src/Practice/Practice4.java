package Practice;

public class Practice4 {
    public static void main(String[] args) {

        int number = 8;

        if(number<=5) {
            System.out.println("It is a weekday");
        } else if(number==6||number==7) {
            System.out.println("It is weekend");
        } else {
            System.out.println("Invalid day");
        }
    }
}
