package review2;

import java.util.Scanner;

public class NotScanner {
    public static void main(String[] args) {

        int i = 10;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter full sentence");
        String sentence = scanner.nextLine();
        System.out.println("sentence that was captured = "+sentence);
        System.out.println("Please enter integer value");
        int number = scanner.nextInt();
        System.out.println("entered number is = "+number);
        System.out.println("Please enter decimal value");
        double decimal = scanner.nextDouble();
        System.out.println("Decimal value "+decimal);

    }
}
