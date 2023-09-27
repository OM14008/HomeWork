package Class8;

import java.util.Scanner;

public class E1WhileLoop {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the starting point, ending point and the step");
        int start = scanner.nextInt();
        int end =scanner.nextInt();
       // int step= scanner.nextInt();

        while(start<=end) {
            System.out.print(start+" ");
            start++;
        }


    }
}
