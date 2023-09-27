package Class24;

import java.util.ArrayList;

public class E10Iterator {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();
        words.add("Coke");
        words.add("coffee");
        words.add("Water");
        words.add("Juice");

      /*  Iterator<String> iterator = words.iterator();
        while(iterator.hasNext()){
            String word = iterator.next();
            if(word.endsWith("e")){
                iterator.remove();
            }
        }*/
        //OR-----------------------
        words.removeIf(word -> word.endsWith("e"));
        System.out.println(words);
    }
}
