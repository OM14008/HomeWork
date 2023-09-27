package Review7;

public class StringMethods {
    public static void main(String[] args) {
        String str="Hello";
        String str1="Hello";

        String str2=new String("Hello");
        System.out.println(str==str1);
        System.out.println(str1==str2);
        str=str.toUpperCase();

        String given="Class";
        StringBuilder strb=new StringBuilder(given);
        given = strb.reverse().toString();
        System.out.println(given);



    }
}
