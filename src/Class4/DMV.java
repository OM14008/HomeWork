package Class4;

import java.util.Scanner;

public class DMV {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your age:");
        int age = scanner.nextInt();

        if(age>=18){
            System.out.println("You will be issued a Drivers License");
        } else{
            System.out.println("You will be offered a Learners Permit ");
        }
    }
}
