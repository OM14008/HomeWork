package Class22;

public interface Task3 {
    static void numberAppear(int[] arr,int numberIn){
        int numberEquals = 0;
        for (int number:arr) {
            if(number==numberIn){
                numberEquals++;
            }
        }
        System.out.println(numberEquals);
    }
}
class Tester{
    public static void main(String[] args) {


     int[] arr = {2,12,36,2,45,78,63,12};

    }
}
