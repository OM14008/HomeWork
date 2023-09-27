package Class28;

import java.util.InputMismatchException;
import java.util.Scanner;

public class E7Task {
    public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Please enter the number");
            scanner.nextInt();

        }catch(InputMismatchException inputMismatchException){
            System.out.println("numbers only");
        }
    }
}
