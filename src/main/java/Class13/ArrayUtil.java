package Class13;

public class ArrayUtil {
    public static void main(String[] args) {
        int number2 = 10;
        int number = 89;
        int number1 = 10;
        int[] arr = {10,20,45,89};
        int[] arr1 = {12,32,455,889};
        ArrayUtil ivan = new ArrayUtil();
        ivan.searchArray(arr,number);


        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==100){
                System.out.println(arr[i]);
            } else {
                System.out.println("the number is not there");
            }
        }



    }
    void searchArray(int [] arr, int number){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==number) {
                System.out.println("Yes");
                break;
            }
        }
    }






}
