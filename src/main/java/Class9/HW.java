package Class9;

public class HW {
    public static void main(String[] args) {
    //From an array of integer elements find the largest number.
        int[] numbers = {25,65,47,52,67,23};
        int largest = 0;
        for(int i=0;i< numbers.length;i++) {
            if(numbers[i]>largest) {
                largest = numbers[i];
            }
        }
        System.out.println(largest);
        //Create an array to store char values and then print those in reverse order

        char[] symbol = {'A','B','C','D','E','F'};
        for(int i=5;i>=0;i--) {
            System.out.println(symbol[i]);
        }

    }
}
