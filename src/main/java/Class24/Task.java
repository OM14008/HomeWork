package Class24;

import java.util.ArrayList;

public class Task {
    public static void main(String[] args) {


        ArrayList<String> names = new ArrayList<>();
        names.add("John");
        names.add("Anna");
        names.add("Veronica");
        names.add("Ken");
        names.add("Julie");
        System.out.println(names.contains("John"));
        System.out.println( names.isEmpty());
        System.out.println( names.size());
        System.out.println(names);

        ArrayList<String> words = new ArrayList<>();
        words.add("Coke");
        words.add("coffee");
        words.add("Water");
        words.add("Juice");
        for (int i = 0; i < words.size(); i++) {
            String nameWithE=words.get(i);
            if(nameWithE.endsWith("e")){
                words.remove(i);
            i--;
            }
        }
        System.out.println(words);
    }
}
