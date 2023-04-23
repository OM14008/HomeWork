package HomeWorkClass12;

import java.util.Scanner;

public class BabyName {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Mom's name");
        String momName = scanner.next();
        System.out.println("Enter Father's name");
        String fatherName = scanner.next();
        System.out.println("Are you expecting boy or girl?");
        String boyGirl = scanner.next();

        if(momName.equals("Mary")&&fatherName.equals("Daniel")&&boyGirl.equals("boy")) {
            System.out.println("Suggested baby name: DANRY");
        } else if(momName.equals("Mary")&&fatherName.equals("Daniel")&&boyGirl.equals("girl")) {
            System.out.println("Suggested baby name: MAIEL");
        } else {
            System.out.println("Parent names are invalid");
        }






    }
}
