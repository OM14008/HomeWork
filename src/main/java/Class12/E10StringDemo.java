package Class12;

public class E10StringDemo {
    public static void main(String[] args) {

        String name = "LEANDROR";
        int symbol=0;
        for (int i = 0; i < name.length(); i++) {
            if(name.charAt(i)=='R') {
                symbol++;
            }
        }
        System.out.println(symbol);

    }
}
