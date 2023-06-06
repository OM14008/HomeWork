package HomeWorkClass26;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class PersonTester {
    private static int key;

    public static void main(String[] args) {

        Map<Integer, Person> map = new LinkedHashMap<>();
        Person person1 = new Person("John","Smith",45,124.5);
        Person person2 = new Person("Anna","Smith",44,24.5);
        Person person3 = new Person("Jacob","Atkins",39,45.3);
        Person person4 = new Person("Jeniffer","Brown",38,50.6);
        Person person5 = new Person("Robert","Scott",56,70.2);

        map.put(1,person1);
        map.put(2,person2);
        map.put(3,person3);
        map.put(4,person4);
        map.put(5,person5);


        for(Map.Entry<Integer,Person>entry:map.entrySet()){
            int key = entry.getKey();
            Person value= entry.getValue();
            System.out.println(key+" "+value);
            
        }
    }
}
