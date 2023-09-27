package Class25;

import java.util.LinkedHashSet;
import java.util.TreeSet;

public class E5Sets {
    public static void main(String[] args) {
        //Sorting in an alphabetic manner and no duplicates as well
        TreeSet<String>fruits=new TreeSet<>();
        fruits.add("Mango");
        fruits.add("Apple");
        fruits.add("Orange");
        fruits.add("Kiwi");
        fruits.add("Banana");
        System.out.println(fruits);

        LinkedHashSet<String>city=new LinkedHashSet<>();
        city.add("New York");
        city.add("Miami");
        city.add("Madrid");
        city.add("Almata");
        city.removeIf(x->x.startsWith("A"));
        System.out.println(city);

    }
}
