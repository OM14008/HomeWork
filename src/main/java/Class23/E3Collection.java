package Class23;

import java.util.ArrayList;

public class E3Collection {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Audry");
        names.add("Vlad");
        names.add("Axel");
        names.add("Adam");
        names.add("Marina");
        names.add("Anna");
        names.add("Joseph");
        names.add("Ken");
        names.add("Bob");

        names.remove("Audry");
        names.remove(2);
        names.indexOf("Marina");
        //names.clear();
        System.out.println(names);
        for(int i=0;i<names.size();i++){
            System.out.println(names.get(i));
        }

    }
}
