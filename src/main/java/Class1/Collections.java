package Class1;

import java.util.*;

public class Collections {
    public static void main(String[] args) {
        // ArrayList can grow and shrink dynamically opposite to an Array which is fixed in size once it's created
//ArrayList preserve order, you can access by index each element
//ArrayList allow duplicates

        ArrayList<String> arrayList = new ArrayList<>(50);
        arrayList.add("Pavel");
        arrayList.add("Ramil");
        arrayList.add("John");
        arrayList.add("Anna");
        arrayList.add("Leo");
        arrayList.add("Audrie");
        arrayList.add("Ken");
        System.out.println("ArrayList"+" "+arrayList);

//LinkedList are efficient for inserting and removing elements it's slow on traversing since it has links
//to the next and previous node
        LinkedList<String>linkedList=new LinkedList<>();
        linkedList.add("apple");
        linkedList.add("kiwi");
        linkedList.add("banana");
        linkedList.add("watermelon");
        linkedList.add("potato");
        System.out.println("LinkedList"+" "+linkedList);

        //HashSet No duplicates
        //HashSet doesn't preserve order
        //There is no .get method in HashSet. we can use for each loop or iterator.
        //works fast on adding removing contains methods
        HashSet<String> uniqueNames=new HashSet<>();
        uniqueNames.add("Yellow");
        uniqueNames.add("Yellow");
        uniqueNames.add("green");
        System.out.println("HashSet"+" "+uniqueNames);

        //LinkedHashSet no duplicates
        //LinkedHashSet preserve the order
        //You can't access elements by its index since it's defined by order you use contains method instead
        LinkedHashSet<String> fruit = new LinkedHashSet<>();
        fruit.add("Kiwi");
        fruit.add("Mango");
        fruit.add("Orange");
        fruit.add("Mango");
        fruit.add("Apple");
        System.out.println("LinkedHashSet"+" "+fruit);


        //TreeSet sorting in an alphabetic manner and no duplicates as well
        TreeSet<String> fruits=new TreeSet<>();
        fruits.add("Mango");
        fruits.add("Apple");
        fruits.add("Orange");
        fruits.add("Kiwi");
        fruits.add("Banana");
        System.out.println("TreeSet"+" "+fruits);

        ArrayList<String>fruit1=new ArrayList<>();
        fruit1.add("Mango");
        fruit1.add("Kiwi");
        fruit1.add("Banana");
        fruit1.add("Orange");
        fruit1.add("Orange");
        //converting arrayList into HashSet
        TreeSet<String> treeSet=new TreeSet<>(fruit);
        System.out.println(treeSet);

//HashMap stores data in key value pairs
//HashMap if you attempt to add duplicate key with diff value it will override previous one
//HashMap doesn't preserve order there is no guarantee that it will
//HashMap can store one null key and multiple null values
//HashMap we can iterate through with entrySet method
        HashMap<String,Double> grocery=new HashMap<>();
        grocery.put("Apple",2.5);
        grocery.put("Soap",3.5);
        grocery.put("Eggs",3.1);
        grocery.put("Milk",2.5);
        grocery.put("Chocolate",1.2);


        //if we insert the data with the same key it will override it
        grocery.put("Apple",4.5);
        System.out.println("HashMap"+" "+grocery);
        System.out.println(grocery.size());
        System.out.println(grocery.containsKey("Banana"));
        System.out.println(grocery.containsKey("Eggs"));
        System.out.println(grocery.containsValue(3.5));
        System.out.println(grocery.isEmpty());
//LinkedHashMap preserve the order
//no key duplicates will be overriden
//can store one null key and multiple null values
//entrySet method is used to iterate through
        LinkedHashMap<Integer,String>ranks=new LinkedHashMap<>();
        ranks.put(1,"James");
        ranks.put(2,"Adam");
        ranks.put(3,"John");
        ranks.put(4,"Jimi");
        ranks.put(5,"Anthony");
        ranks.remove(2);
        System.out.println("LinkedHashMap"+" "+ranks);
        ranks.replace(1,"Adam");
        System.out.println(ranks);
//TreeMap stores key value pairs
//TreeMap sorting data in ascending order based on the key
//TreeMap no duplicate will override the existing one
        TreeMap<String,Double>makeUp=new TreeMap<>();
        makeUp.put("Lipstick",100.0);
        makeUp.put("BlushOn",68.0);
        makeUp.put("EyeLiner",80.0);
        makeUp.put("Foundation",120.0);
        makeUp.put("Base",25.0);


        Set<String>keys=makeUp.keySet();
        System.out.println("Set"+" "+keys);
        Collection<Double> values = makeUp.values();
        System.out.println("Collection"+" "+values);

    }
}
