package Practice;

import java.util.Scanner;

public class Practice1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number1: ");
        int number1 = scanner.nextInt();
        System.out.print("Enter number2: ");
        int number2 = scanner.nextInt();



        System.out.println(number1+"+"+number2+"="+(number1+number2));
        System.out.println(number1+"-"+number2+"="+(number1-number2));
        System.out.println(number1+"*"+number2+"="+(number1*number2));
        System.out.println(number1+"/"+number2+"="+(number1/number2));
        System.out.println(number1+"mod"+number2+"="+(number1%number2));

    }
}
