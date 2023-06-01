package HomeWorkClass26;

import java.util.HashMap;
import java.util.Map;

public class HighestSalary {
    public static void main(String[] args) {
        HashMap<String,Double>map=new HashMap<>();
        map.put("John Smith",50.3);
        map.put("Anna Brown",51.5);
        map.put("Eric Lump",49.2);
        map.put("Diana Atkins",42.3);

        String highestSName="";
        double highestSal=0;
        for(Map.Entry<String,Double>entry: map.entrySet()){
            String key= entry.getKey();
            double value= entry.getValue();
            if(value>highestSal){
                highestSal=value;
                highestSName=key;
            }
        }
        System.out.println(highestSName+"=$"+highestSal);
    }

}
