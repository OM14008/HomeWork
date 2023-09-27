package Class18;

public class E1MultipleConstructor {
    public static void main(String[] args) {

        char[] chars2 = {'t','h','e','j','a','v','a'};
        String str1 = new String(chars2);
        str1 = str1.substring(3,7);
        str1 = str1.toUpperCase();
        System.out.println(str1);
        //OR
        String str3 = new String(chars2,3,4);
        System.out.println(str3.toUpperCase());
    }
}
