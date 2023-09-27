package Class25;

import java.util.ArrayList;
import java.util.TreeSet;

public class E6CollectionFramework {
    public static void main(String[] args) {
        ArrayList<String>fruit=new ArrayList<>();
        fruit.add("Mango");
        fruit.add("Kiwi");
        fruit.add("Banana");
        fruit.add("Orange");
        fruit.add("Orange");
        //converting arrayList into HashSet
        TreeSet<String> treeSet=new TreeSet<>(fruit);
        System.out.println(treeSet);

    }
}
