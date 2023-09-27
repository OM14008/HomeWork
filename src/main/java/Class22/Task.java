package Class22;

public class Task {
     void findNumber(int[] arr){
        for(int number:arr)
            if(number<10) {
                System.out.println(number);
            }
    }
}
class TaskTester{
    public static void main(String[] args) {
        Task task = new Task();
        int[] arr = {12,10,3,6,74,};
        task.findNumber(arr);
    }
}
