package Class12;

public class E11StringDemo {
    public static void main(String[] args) {
        int symbol = 0;
        String name = "Today is saturday";
        //System.out.println(name.indexOf('i'));
        //System.out.println(name.indexOf('a'));
       // Starts the search from index number 4;
        //System.out.println(name.indexOf('a',4));
        for (int i = 0; i < name.length(); i++) {
            if(name.charAt(i)=='a') {
               System.out.print(name.charAt(i));
                symbol++;
                System.out.println(" at index #"+i);
            }
        }
        //System.out.println(symbol);









    }
}
