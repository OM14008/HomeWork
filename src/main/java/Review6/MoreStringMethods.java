package Review6;

public class MoreStringMethods {
    public static void main(String[] args) {

        String day = "Thursday";
        char symbol = day.charAt(0);
        System.out.println(symbol);
        int index = day.indexOf('s');
        System.out.println(index);
        int anotherIndex = day.indexOf("day");
        System.out.println(anotherIndex);

        String food = "I like indian food";
        String[] arrElement = food.split(" ");
        for(String word : arrElement) {
            System.out.println(word);
        }

        }
    }

