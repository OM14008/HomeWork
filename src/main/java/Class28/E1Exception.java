package Class28;

public class E1Exception {
    public static void main(String[] args) {
        System.out.println("Line1");
        System.out.println("Line2");
        System.out.println("Line3");
        System.out.println("Line4");

        System.out.println("Line5");
        try {
            "name".charAt(0);
        }catch(Exception e) {
            System.out.println("Plan b");
        }
        System.out.println("line6");
    }
}
