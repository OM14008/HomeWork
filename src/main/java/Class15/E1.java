package Class15;

import java.util.Arrays;

public class E1 {
    int[] createArray (int size) {
      int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i]=10;
        }
        return arr;
    }

    public static void main(String[] args) {
        E1 e1 = new E1();
        int[] array = e1.createArray(5);
        for (int i : array) {
            System.out.println(i);
        }// OR
        System.out.println(Arrays.toString(array));
    }
}

