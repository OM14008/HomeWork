package Class25;

import java.util.LinkedHashSet;

public class E4Sets {
    public static void main(String[] args) {

        //no duplicates will be printed, but it will remember the insertion order
        //preserves the order in which elements been added
        //You can't access elements by its index since it's defined by order you use contains method instead
        LinkedHashSet<String> fruit = new LinkedHashSet<>();
        fruit.add("Kiwi");
        fruit.add("Mango");
        fruit.add("Orange");
        fruit.add("Mango");
        fruit.add("Apple");
        System.out.println(fruit);
    }
}
