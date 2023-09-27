package Review12;

import java.util.Map;
import java.util.TreeMap;

public class Task {
    public static void main(String[] args) {

        int[] arr={10,20,10,30,40,50,20,30,70,80,70};

        Map<Integer,Integer>map=new TreeMap<>();
        for(int num:arr){
            if(map.get(num)==null){
                map.put(num,1);

            }else {
                int count = map.get(num) + 1;
                map.replace(num, count);
            }
        }
        System.out.println(map);













        int number=10;
        int count=0;
        for(int num:arr){
            if(num==number){
                count++;

            }

        }
        System.out.println(number+" "+count);
    }
}
