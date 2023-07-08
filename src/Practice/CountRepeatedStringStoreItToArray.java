package Practice;

import java.lang.reflect.Array;
import java.util.*;

public class CountRepeatedStringStoreItToArray {
    public static void main(String[] args) {
        ArrayList<String> input = new ArrayList<>(Arrays.asList("switch", "tv", "switch", "tv", "switch", "tv"));
        Map<String, Integer> countMap = new HashMap<>();
        ArrayList<String> output = new ArrayList<>();
        for (String item : input) {
            int count = countMap.getOrDefault(item,0);
            if(count==0) {
                output.add(item);
            }else{
                output.add(item+count);
            }
            countMap.put(item, count + 1);
        }
        System.out.println(output);
    }
}





