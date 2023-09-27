package Class22;

public interface ArrayUtil {
    public boolean searchArr(int[] array,int number);
}
class Main implements ArrayUtil{
    @Override
    public  boolean searchArr(int[] array, int number) {
        for(int specNumber : array){
            if(specNumber==number){
                return true;
            }
        }
        return false;
    }
}
class ArrayUtilTester{
    public static void main(String[] args) {
        Main main = new Main();
        int[] arr = {12,45,23,56,78};
        boolean number = main.searchArr(arr,12);
        System.out.println(number);

    }
}
