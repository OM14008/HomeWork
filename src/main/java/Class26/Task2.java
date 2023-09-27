package Class26;

import java.util.LinkedHashMap;
import java.util.Map;

public class Task2 {
    public static void main(String[] args) {
        Map<String, String> bestBuy = new LinkedHashMap<>();
        bestBuy.put("1254","printer");
        bestBuy.put("78964","coffee cup");
        bestBuy.put("1471","ice-maker");
        bestBuy.put("96325","coffee-maker");
        bestBuy.put("9547","jeans");
        for(String s:bestBuy.keySet()){
            System.out.print(s+" ");
        }
        System.out.println();
        for(String d:bestBuy.values()){
            System.out.print(d+" ");
        }
        System.out.println();
        for(var e:bestBuy.entrySet()){
            System.out.println(e.getKey()+" "+e.getValue());
        }

    }
}
