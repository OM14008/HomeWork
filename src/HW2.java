public class HW2 {
    public static void main(String[] args) {
        String[][] grocery = { {"Banana","Chery","Strawberry",},
                               {"Carrots","Potato","Letters","Pepper"},
                               {"Cheese","Milk","Yogurt","Butter"},
                               {"Candy","Cake","Gum",} };
        for (int i = 0; i < grocery.length; i++) {
            for (int j = 0; j < grocery[i].length; j++) {
                System.out.print(grocery[i][j]+" ");
            }
        }
        System.out.println();
        for(String[] shop : grocery) {
            for(String store : shop) {
                System.out.print(store+" ");
            }
        }
        System.out.println();
        int[][] numbers = { {12,25,68,},{45,12,85},{54,25,63} };
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                 sum = numbers[i][j]+sum;
            }
        } System.out.print(sum+" ");
        System.out.println();
        int[][] numbers2 = {{12,28,62,13},{25,54,93,51},{21,23,45,87}};
        for (int i = 0; i < numbers2.length; i++) {
            for (int j = 0; j < numbers2[i].length; j++) {
                if(numbers2[i][j]%2==0) {
                    System.out.print(numbers2[i][j]+" ");
                }
            }
        }
        System.out.println();
        String[][]  countries = { {"USA","Mexico","Canada",},{"Brazil","Argentina","Colombia"},
                                 {"Germany","Italy","Spain"},{"Algeria","Libya","Morocco"} };

        int sum1 = 0;
        for (int i = 0; i < countries.length; i++) {
            for (int j = 0; j < countries[i].length; j++) {
                System.out.print(countries[i][j]+" ");
                sum1++;
            }
        }
        System.out.println(sum1);

        for(String[] values : countries ) {
            for(String values2 : values) {
                System.out.print(values2+" ");
            }
        }

    }
}
