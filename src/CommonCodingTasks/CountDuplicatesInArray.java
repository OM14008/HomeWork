package CommonCodingTasks;

import java.util.HashMap;
import java.util.Map;

public class CountDuplicatesInArray extends Method {
    public static void main(String[] args) {
        //Input [12,12,13,45,78,7,7] output 2
        //Input [12,12,7,7,7,7,7] output 2
        int[] arr = {12, 12, 13, 45, 78, 7, 7};
        int[] arr1 = {12,12,7,7,7,7,7};
        Map<Integer, Integer> map = countDuplicatesInArray(arr);
        for(Integer key:map.keySet()){
            int value = map.get(key);
            System.out.println(key+" repeatingCount "+value);
        }

    }
 }
   class Method{
        public static Map<Integer,Integer> countDuplicatesInArray(int[] arr){
            Map<Integer,Integer> duplicates = new HashMap<>();
        for(int number:arr){
            if(duplicates.containsKey(number)){
               int count = duplicates.get(number);
                duplicates.put(number,count+1);
            }else{
                duplicates.put(number,1);
            }
        }
       return duplicates;
      }
  }

