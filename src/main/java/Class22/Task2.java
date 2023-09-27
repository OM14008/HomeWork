package Class22;

public class Task2 {
    void average(int[] arr){
        int sum = 0;
        int average = 0;
        int numberCount=0;
        for(int number : arr ){
            sum+=number;
            numberCount++;
        }
        average = sum/numberCount;
        System.out.println(average);
    }
}
class Task2Tester{
    public static void main(String[] args) {
       Task2 task2 = new Task2();
       int[] arr = {12,56,54,78,31,63,94};
       task2.average(arr);
    }
}

