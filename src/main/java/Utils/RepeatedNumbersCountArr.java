package Utils;

import java.util.HashMap;
import java.util.Map;

public class RepeatedNumbersCountArr {
        public static Map<Integer,Integer> repeatedNumbers(int[] arr) {
            Map<Integer, Integer> map = new HashMap<>();
            int count=0;
            for (int i = 0; i < arr.length; i++) {
                if (!map.containsKey(arr[i])) {
                    count = 0;
                    for (int j = i; j < arr.length; j++) {
                        if (arr[i] == arr[j]) {
                            count++;
                            map.put(arr[i], count);
                        }
                    }
                }
            }
            return map;
        }
}

