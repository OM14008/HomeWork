package Class25;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.TreeSet;

public class Task {
    public static void main(String[] args) {
        List<String>aList=new ArrayList<>();
        aList.add("John");
        aList.add("Jane");
        aList.add("James");
        aList.add("jasmine");
        aList.add("Jane");
        aList.add("James");

        LinkedHashSet<String> names = new LinkedHashSet<>();
        System.out.println(names);

        TreeSet<String>name=new TreeSet<>();
        name.add("USA");
        name.add("Germany");
        name.add("Italy");
        name.add("Spain");
        name.add("Poland");
        System.out.println(name);
        for(String c:name){
            System.out.print(c+" ");
        }
    }
}
