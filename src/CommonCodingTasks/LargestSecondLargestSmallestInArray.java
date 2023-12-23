package CommonCodingTasks;

public class LargestSecondLargestSmallestInArray {
    public static void main(String[] args) {
        int[] number = {12,35,47,5,98,24,1,46,85,41,2,89,8};
        int largest = 0;
        int secondLargest = 0;
        int smallest = number[0];
        for(int i=0;i<number.length;i++) {
            if (number[i] > largest) {
                largest = number[i];
            }
        }
            for(int j=0;j< number.length;j++) {
                if (number[j] > secondLargest && number[j] != largest) {
                    secondLargest = number[j];
                } else if (number[j] < smallest) {
                    smallest = number[j];
                }
             }
            System.out.println("Largest Number "+largest+" \n"+"SecondLargest "+secondLargest+"\n"+ "Smallest "+smallest);
        System.out.println();




    }
}
