package Class25;

import java.util.HashSet;

public class E3Sets {
    public static void main(String[] args) {
        //Hashset doesn't allow duplicates even if you add some it will print only one of them
        //HashSet doesn't remember the insertion order, therefore it's printing out randomly
        //There is no .get method in HashSet. we can use for each loop or iterator.
        //works fast on adding removing contains methods
        HashSet<String>uniqueNames=new HashSet<>();
        uniqueNames.add("Yellow");
        uniqueNames.add("Yellow");
        uniqueNames.add("green");
        System.out.println(uniqueNames);

    }
}
