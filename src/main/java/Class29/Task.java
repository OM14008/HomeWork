package Class29;

public class Task {
    public static int method(int[] arr){
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            sum=sum+arr[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] arr1 = {12,32,65,45,87,98,4,32,1,25,45};
        System.out.println(method(arr1));
    }
}
