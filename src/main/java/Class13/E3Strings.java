package Class13;

public class E3Strings {
    public static void main(String[] args) {

        String str = "aksdljfjASDGAGFDSK231543!#$%#$%&";
        System.out.println(str.replaceAll("[a-z]",""));
        System.out.println(str.replaceAll("[a-z0-9]",""));
    }
}
