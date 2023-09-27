package Class26;

import java.util.LinkedHashMap;
import java.util.TreeMap;

public class Task {
    public static void main(String[] args) {
       /* Create a map of a building. Store floor number and it is associated company name. (Example: 1= Google, 2=Syntax etc..). Insert 7 entries with duplicate keys and values.
        Check how many entries you have?
        Update company on a 4th floor
        Remove company on the 7th floor
        Print your map*/
        LinkedHashMap<Integer, String> map = new LinkedHashMap<>();
        map.put(1, "Google");
        map.put(2, "Syntax");
        map.put(3, "Microsoft");
        map.put(4, "Walmart");
        map.put(5, "Ebay");
        map.put(6, "Amazon");
        map.put(7, "Metro");
        System.out.println(map.size());
        map.remove(4);
        map.remove(7);
        map.replace(6, "Honda");
        System.out.println(map);

        TreeMap<String, String> countryCapital = new TreeMap<>();
        countryCapital.put("Spain","Madrid");
        countryCapital.put("USA","Washington DC");
        countryCapital.put("France","Paris");
        countryCapital.put("Germany","Frankfurt");
        countryCapital.put("Japan","Tokyo");
        for(String s:countryCapital.keySet()){
            System.out.print(s+" ");
        }
        System.out.println();
        for(String d:countryCapital.values()){
            System.out.print(d+" ");
        }
        System.out.println();
        for(var e:countryCapital.entrySet()){
            System.out.println(e.getKey()+" "+e.getValue());
        }


    }
}
