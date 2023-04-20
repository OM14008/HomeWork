package ClassHomeWork;

public class JavaTask2 {
    public static void main(String[] args) {

        //printing the highest and the lowest element in an array
         int[] numbers = {21,32,45,12,52,20,69,58,10};
         int highestNumber = numbers[0];
         int lowestNumber = numbers[0];
         for(int j : numbers) {
             if(j>highestNumber) {
                 highestNumber = j;
             } else if(j<lowestNumber) {
                 lowestNumber = j;
             }
         }
        System.out.println("The highestNumber is "+highestNumber);
        System.out.println("The lowestNumber is "+lowestNumber);
        System.out.println();

        //Identifying and printing prime and not prime numbers in an array
        int[]  numbers1 = {12,9,52,41,63,47,58,96,87,21,32};
        for (int i = 0; i < numbers1.length; i++) {
            for (int j = 2; j <= numbers1[i]/2; j++) {
                if (numbers1[i] % j == 0) {
                    System.out.println(numbers1[i] + " " + "is NOT a prime number");
                    break;
                }
                if(j==numbers1[i]/2) {
                    System.out.println(numbers1[i]+" "+"IS A PRIME NUMBER" );
                }
            }
        }
        System.out.println();
        String[] fruits = {"watermelon","grapes","orange","kiwi","grapes","apple","dragonFruit","kiwi","orange"};
        for (int i = 0; i < fruits.length; i++) {
            for (int j = i+1; j < fruits.length; j++) {
                if(fruits[i].equals(fruits[j])) {
                    System.out.println(fruits[i]);
                }
            }
        }
    }
}
