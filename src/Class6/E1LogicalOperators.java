package Class6;

public class E1LogicalOperators {
    public static void main(String[] args) {

        boolean chocolates = true;
        boolean flowers = false;
        if(flowers||chocolates) {
            System.out.println("I am happy");
        }else{
            System.out.println("I am sad");
        }
        boolean fiveG = false;
        boolean wifi = true;
        if(wifi||fiveG) {
            System.out.println("You can browse the internet ");
        } else {
            System.out.println("Not connected to the internet");
        }
        boolean doorOpen = false;
        boolean trunkOpen = true;
        if(doorOpen||trunkOpen) {
            System.out.println("Close the trunk");
        } else {
            System.out.println("Close the door");
        }

    }
}
