package Class25;

import java.util.Collection;
import java.util.TreeMap;

public class E10Map {
    public static void main(String[] args) {

            TreeMap<String,Double> makeUp=new TreeMap<>();
            makeUp.put("Lipstick",100.0);
            makeUp.put("BlushOn",68.0);
            makeUp.put("EyeLiner",80.0);
            makeUp.put("Foundation",120.0);
            makeUp.put("Base",25.0);

            Collection<Double> values=makeUp.values();
            values.removeIf(v->v>80);
            System.out.println(makeUp);
        }
    }

