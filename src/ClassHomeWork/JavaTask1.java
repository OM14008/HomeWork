package ClassHomeWork;

public class JavaTask1 {
    public static void main(String[] args) {
        //Task 5; Swapping two numbers without temporary variable
        int a = 7;
        int b = 3;
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println(a+" "+b);
     //Task 4; calculating the sum of even and odd elements of the array individually

        int[][] numbers = {{45,63,47,78},{14,25,36,69},{47,58,69,79},{12,52,63,82}};
        int sumEvenNum = 0;
        int sumOddNum = 0;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                if(numbers[i][j]%2==0) {
                    System.out.print(numbers[i][j] + " ");
                    sumEvenNum = numbers[i][j] + sumEvenNum;
                } else if(numbers[i][j]%2==1) {
                    System.out.print(numbers[i][j]+" ");
                    sumOddNum = numbers[i][j]+sumOddNum;
                }
            }
        }
        System.out.println();
        System.out.println("The sum of even numbers is "+sumEvenNum);
        System.out.println("The sum of odd numbers is "+sumOddNum);

        System.out.println();
        //printing the secondLargest element in an array
        int largest = 0;
        int secondLargest = 0;
        int[] numbers1 = {12,58,79,65,23,36,85,46,58,54,56,87,92,32};
        for (int i = 0; i < numbers1.length; i++) {
            if (numbers1[i] > largest) {
                largest = numbers1[i];
            }
            for (int j = 0; j <= i; j++) {
                if (numbers1[j] != largest && numbers1[j]>secondLargest) {
                    secondLargest = numbers1[j];
                }
            }
        }
        System.out.println("The largest " + largest);
        System.out.println("The secondLargest " + secondLargest);




    }
}
