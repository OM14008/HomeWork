package Review11;

import java.util.ArrayList;
import java.util.List;

public class E7ArrayList {
    public static void main(String[] args) {
        List<String> students = new ArrayList<>();
        students.add("Adam");
        students.add("Sarah");
        students.add("Halima");
        students.add("Abdul");
        students.add("Semir");
        students.add("Semir");

        students.remove("Halima");
        System.out.println(students);
        
    }
}
