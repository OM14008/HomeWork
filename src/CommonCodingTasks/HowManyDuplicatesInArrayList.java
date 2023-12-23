package CommonCodingTasks;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class HowManyDuplicatesInArrayList {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();
        words.add("apple");
        words.add("banana");
        words.add("cherry");
        words.add("apple");
        words.add("banana");
        words.add("apple");
     Map<String,Integer> repeating = new HashMap<>();//creating new map to store our fruits with count
     for(String word:words){//iterating through arrayList
         if(repeating.containsKey(word)){            //checking if the word from arrayList is present in repeatingWords Map
             int count = repeating.get(word);//if true we get that word from repeatingWords Map by.get(word)passing the word from loop
             repeating.put(word,count+1);
         }else{
             repeating.put(word,1);
         }
     }
     for(Map.Entry<String,Integer> elements:repeating.entrySet()){ //printing the contents of our repeatingWords Map
         String key = elements.getKey();
         int value = elements.getValue();
         System.out.println(key+" "+value);
     }
    }
}
