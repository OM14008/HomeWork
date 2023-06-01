package HomeWorkClass26;

import java.util.*;

public class SingleObjectCollection {
    public static void main(String[] args) {
        Collection<String> set=new LinkedList<>();
        set.add("Java");
        set.add("is");
        set.add("the");
        set.add("best");
        set.add("programming");
        set.add("language");
        set.add("in");
        set.add("the");
        set.add("world");
        for(String word:set){
            System.out.print(word+" ");
        }
    }
}
