package Class24;

import java.util.ArrayList;

public class E1ArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
           numbers.add(10);
           numbers.add(20);
           numbers.add(100);
           numbers.add(200);
        Integer integer = 10;
        Integer integer1 = 20;
        String str = "NO";
        System.out.println(integer*integer1);

        int i=0;
        while(i<numbers.size()){
            System.out.println(numbers.get(i));
            i++;
        }
        int j=0;
        do{
            System.out.println(numbers.get(j));
            j++;
        }while (j<numbers.size());
    }
}
