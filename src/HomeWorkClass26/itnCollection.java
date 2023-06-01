package HomeWorkClass26;

import java.util.Collection;
import java.util.LinkedList;

public class itnCollection {
    public static void main(String[] args) {
        Collection<Integer>num=new LinkedList<>();
        num.add(12);
        num.add(45);
        num.add(50);
        num.add(12);
        num.add(45);
        num.add(85);
        num.add(45);

        int sum=0;
        for(Integer elem:num){
           sum+=elem;
        }
        System.out.println(sum);
    }
}
