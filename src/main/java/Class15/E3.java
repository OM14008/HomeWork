package Class15;

import java.util.Locale;

public class E3 {
    int sumArr (int[] arr){
       int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = arr[i]+sum;
        }
        return sum;
    }
    String name (String word){
        String upperCase = word.toUpperCase();
        return upperCase;
    }
    public static void main(String[] args) {
        E3 e3 = new E3();
        int sum = e3.sumArr(new int[]{12,25,36,78});
        System.out.println(sum);
        String upper = e3.name("hope");
        System.out.println(upper);
    }

}
