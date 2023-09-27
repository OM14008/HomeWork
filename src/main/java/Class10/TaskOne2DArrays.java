package Class10;

public class TaskOne2DArrays {
    public static void main(String[] args) {

         int[][] matrix = {
                 {10,20,30},
                 {20,50,65},
                 {102,54,60},
         };
         System.out.print(matrix[1][1]+" ");
         System.out.print(matrix[1][2]+" ");
         System.out.print(matrix[0][0]+" ");
         System.out.println();

         int[][] matrix1 = new int[3][3];
         matrix[0][0]=10;
         matrix[1][1]=20;
         matrix[2][2]=50;
        System.out.println(matrix[1][2]+" ");
        System.out.println();

        int[] arr1 = matrix[1];
        for (int i = 0; i <arr1.length; i++) {
            System.out.print(arr1[i]+" ");
        }
        System.out.println();

        arr1 = matrix[2];
        for (int i = 0; i <arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }




    }
}
