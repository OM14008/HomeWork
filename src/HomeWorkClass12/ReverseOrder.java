package HomeWorkClass12;

public class ReverseOrder {
    public static void main(String[] args) {

        String day = "Sunday";
        for (int i = day.length()-1; i >= 0; i--) {
            System.out.print(day.charAt(i));
        }
    }
}
