package Review11;

import java.util.ArrayList;

public class E4ArrayList {
    public static void main(String[] args) {

        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Adam");
        arrayList.add("Sarah");
        arrayList.add("Halima");
        arrayList.add("Abdul");
        arrayList.add("Semir");
        arrayList.add("Semir");
        arrayList.remove("Semir");
        System.out.println(arrayList);
        arrayList.removeIf(x->x.startsWith("A"));
        System.out.println(arrayList);
    }
}
