package CommonCodingTasks;

import java.util.ArrayList;
import java.util.HashSet;

public class RemoveDuplicatesFromArrayLIst {
    public static void main(String[] args) {
        ArrayList<String> aList = new ArrayList<>();
        aList.add("John");
        aList.add("Jane");
        aList.add("James");
        aList.add("Jasmine");
        aList.add("Jane");
        aList.add("James");
        HashSet<String> aSet = new HashSet<>(aList);
        System.out.println(aSet);
        //or other way
        HashSet<String> aSet2 = new HashSet<>();
        for(String element:aList){
            aSet2.add(element);
        }
        System.out.println(aSet2);
    }
}
