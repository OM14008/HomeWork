package Class26;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class PracticeListMapStringObjectNewArrayList {
    public static void main(String[] args){

            List<Map<String,Object>> dataList=new ArrayList<>();

            Map<String,Object>appleMap=new HashMap<>();
            appleMap.put("Items","Apple");
            appleMap.put("Price",20.00);
            appleMap.put("Quantity",10);
            dataList.add(appleMap);

            Map<String,Object>orangeMap=new HashMap<>();
            orangeMap.put("Items", "Orange");
            orangeMap.put("Price", 21.99);
            orangeMap.put("Quantity", 10);
            dataList.add(orangeMap);
            double totalPurchase=0.0;

            for(Map<String,Object>map:dataList){
                String item=(String)map.get("Items");
                double price=(double)map.get("Price");
                double quantity=(int)map.get("Quantity");
                double subTotal=price*quantity;
                totalPurchase+=subTotal;
                System.out.println("Items: "+item+" Price: "+price+" Quantity: "+quantity+" SubTotal: "+subTotal+"\n");
            }
            System.out.println("Your Purchase total : "+totalPurchase);

        }
    }

