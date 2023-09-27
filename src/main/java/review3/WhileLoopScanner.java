package review3;

import java.util.Scanner;

public class WhileLoopScanner {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        System.out.println("Please enter integer values");

        while(scanner.hasNextInt()) {
            int userInput = scanner.nextInt();
            sum += userInput;
        }
        System.out.println("sum= "+sum);




    }
}
