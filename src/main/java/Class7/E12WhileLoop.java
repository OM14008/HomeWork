package Class7;

import java.util.Scanner;

public class E12WhileLoop {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = scanner.nextInt();

        int counter = 1;
        while(counter<=number) {
            System.out.print(counter+" ");
            counter++;
        }
    }

}
