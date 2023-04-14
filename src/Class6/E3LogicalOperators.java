package Class6;

import java.util.Scanner;

public class E3LogicalOperators {
    public static void main(String[] args) {


        /*boolean rich = true;
        boolean invitationFormRR = false;

        if(rich && invitationFormRR) {
            System.out.println("Yes you can buy RR");
        } else{
            System.out.println("You can't buy RR");
        }*/
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the the number in inches");
        int height = scanner.nextInt();

        if(height<60){
            System.out.println("short");
        } else if(height>=60 && height<=72){
            System.out.println("medium");
        } else {
            System.out.println("tall");
        }



    }
}
