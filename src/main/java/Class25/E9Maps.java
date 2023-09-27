package Class25;

import java.util.Collection;
import java.util.Set;
import java.util.TreeMap;

public class E9Maps {
    public static void main(String[] args) {
        TreeMap<String,Double>makeUp=new TreeMap<>();
        makeUp.put("Lipstick",100.0);
        makeUp.put("BlushOn",68.0);
        makeUp.put("EyeLiner",80.0);
        makeUp.put("Foundation",120.0);
        makeUp.put("Base",25.0);


        Set<String>keys=makeUp.keySet();
        System.out.println(keys);
        Collection<Double> values = makeUp.values();
        System.out.println(values);

    }
}
