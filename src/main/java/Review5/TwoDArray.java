package Review5;

public class TwoDArray {
    public static void main(String[] args) {

        String[][] cars = { {"Ford","Lincoln","Dodge"},
                            {"BMW","Audi","Mercedes","VW","Fiat"},
                            {"Honda","Toyota","Subaru","Nissan"} };
        for (String[] row : cars) {
            for (String element : row) {
                System.out.println(element+" ");
            }
        }








    }
}
