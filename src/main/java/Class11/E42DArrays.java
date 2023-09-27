package Class11;

public class E42DArrays {
    public static void main(String[] args) {

        int[][] arr2D = { {10,20,30,40,50},
                          {1,2,3,4,5},
                          {5,5,5,5,5},
                          {10,8,6,4,2} };

        int sum = 0;
        for(int[] row : arr2D) {
            for(int row2 : row) {
                System.out.print(row2+" ");
                sum=row2+sum;
            }
           System.out.println(sum);
            sum=0;
        }


















    }
}
