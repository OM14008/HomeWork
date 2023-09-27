package Class24;

import java.util.ArrayList;

public class E11ArrayList {
    public static void main(String[] args) {
        var name = "Vlad";
        var age = 12;
        var price = 12.4;
        ArrayList<String> names = new ArrayList<>();
        //OR-----------
       // var names1=new ArrayList<>();
        ArrayList<String> drinks = new ArrayList<>();
        drinks.add("Coke");
        drinks.add("Pepsi");
        drinks.add("Fanta");
        drinks.add("Water");
        for (int i = 0; i < drinks.size(); i++) {
            String word=drinks.get(i);
            if (word.contains("e") || word.contains("a")) {
                drinks.set(i,"water");


            }
        }
        System.out.println(drinks);

        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 2; i < 500; i+=2) {
            numbers.add(i);
          }
        System.out.println(numbers);
        numbers.removeIf(x->x%5==0);
        System.out.println(numbers);
        }
    }

