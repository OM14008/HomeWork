package Review11;

import java.util.ArrayList;

public class E6ArrayList {
    public static void main(String[] args) {
        ArrayList<String> students = new ArrayList<>();
        students.add("Adam");
        students.add("Sarah");
        students.add("Halima");
        students.add("Abdul");
        students.add("Semir");
        students.add("Semir");
        
        ArrayList<String> feeDefaulter = new ArrayList<>();
        feeDefaulter.add("Axel");
        feeDefaulter.add("Leandro");
        feeDefaulter.add("Farwa");
        feeDefaulter.add("Adam");
        feeDefaulter.add("Axel");
        students.removeAll(feeDefaulter);
        System.out.println(students);
    }
}
