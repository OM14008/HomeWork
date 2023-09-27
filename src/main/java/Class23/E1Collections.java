package Class23;

import java.util.ArrayList;

public class E1Collections {
    public static void main(String[] args) {
       String name = "Vero";
       String name1 = "Rajbeer";
       String[] names = {"Sarah","lean",};
       String[] names1 = new String[2];
       names1[0]="Semir";
// ArrayList can grow and shrink dynamically opposite to an Array which is fixed in size once it's created
//ArrayList maintains the order, elements are stored in the order they are added, you can access by index each element
//ArrayList allow duplicates you can store multiple duplicates with the same value
//
       ArrayList<String> arrayList = new ArrayList<>(50);
       arrayList.add("Pavel");
       arrayList.add("Ramil");
       arrayList.add("John");
       arrayList.add("Anna");
       arrayList.add("Leo");
       arrayList.add("Audrie");
       arrayList.add("Ken");
       System.out.println(arrayList);


    }
}
