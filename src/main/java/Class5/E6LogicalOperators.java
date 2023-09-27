package Class5;

public class E6LogicalOperators {
    public static void main(String[] args) {

        int age = 17;
        if(age<18 || age>60) {
            System.out.println("You get a discount");
        }
        char gender = 'F';
        String name = "Mary";
        if(gender=='F'|| age>60) {
            System.out.println("You will get a discount");
        }


    }
}
