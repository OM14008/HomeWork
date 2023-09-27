package Review5;

public class Task4 {
    public static void main(String[] args) {

        int sumEven = 0;
        int sumOdd = 0;
        int number;
        int[][] array = { {12,-12,67,85,98,},{45,13,46},{79,48,},{98,65,32,87,}};

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if(array[i][j]%2==0) {
                    sumEven+=array[i][j];
                } else {
                    sumOdd+=array[i][j];
                }
            }
        }
        System.out.println(sumEven+" "+sumOdd);
    }
}
