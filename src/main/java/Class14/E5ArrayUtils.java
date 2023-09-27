package Class14;

public class E5ArrayUtils {
    boolean contains(int[] arr,int num) {
        boolean isFound = false;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==num) {
                isFound=true;
                break;
            }
        }
        return isFound;
    }

    public static void main(String[] args) {
        E5ArrayUtils obj = new E5ArrayUtils();
        int[] arr ={10,20,45};
        int numberInArr = 13;
        boolean result = obj.contains(arr,numberInArr);
        System.out.println(result);
    }


}
