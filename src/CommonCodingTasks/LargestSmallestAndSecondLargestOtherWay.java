package CommonCodingTasks;

public class LargestSmallestAndSecondLargestOtherWay {
    public static void main(String[] args) {
        int[] number = {12,35,47,5,98,24,1,46,85,41,2,89,8};
        int smallest = number[0];
        int secondLargest = 0;
        int largest = 0;
        for(int i=0;i < number.length;i++){
            int element = number[i];
            if(element>largest){
                secondLargest=largest;
                largest=element;
            }else if(element>secondLargest&&element!=largest){
                secondLargest=element;
            }
            if(element<smallest){
                smallest=element;
            }
        }
        System.out.println("smalest "+smallest);
        System.out.println("largest "+largest);
        System.out.println("seconLargest "+secondLargest);
    }
}
