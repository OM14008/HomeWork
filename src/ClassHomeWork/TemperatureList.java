package ClassHomeWork;

public class TemperatureList {
    public static void main(String[] args) {
        // Task 1; finding the highest and the lowest number in an array
        int[] temp = {12, 25, 8, 50, 70, 65, 24,};
        int high = 0;
        int low = temp[0];
        for (int j : temp) {
            if (j > high) {
                high = j;
            } else if (j < low) {
                low = j;
            }
        }
        System.out.println("The highest temp is " + high + " and the lowest is " + low);
        System.out.println();
        //Task 2; calculating the sum of all stored elements in an array
        int[] numbers = {1, 56, 32, 14, 87, 69, 34, 89};
        int sum = 0;
        for (int j : numbers) {
            sum = j + sum;
        }
        System.out.println("The Grand total of the array is " + sum);
        System.out.println();
        //Task 3; printing the even numbers only from an array
        int[][] arr = {{45, 12, 68, 17,}, {56, 88, 14, 63}, {36, 58, 60, 99}};
        for (int[] kl : arr) {
            for (int lm : kl) {
                if (lm % 2 == 0) {
                    System.out.print(lm + " ");
                }
            }
        }
        System.out.print("are the even numbers of 2D array");
        System.out.println();

        //Task 7;  Fibonacci numbers
            int a = 0;
            int b = 1;
            int c;
            for (int i = 0; i < 3; i++) {
                c = a + b;
                System.out.print(c + " ");
                a = c + b;
                System.out.print(a + " ");
                b = a + c;
                System.out.print(b + " ");
            }
                c = a + b;
                System.out.println(c);






    }
}
