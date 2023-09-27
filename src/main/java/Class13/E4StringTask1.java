package Class13;

public class E4StringTask1 {
    public static void main(String[] args) {
        String str ="djfhjdkaDSFGREW1242351345";
        String str1 = str.replaceAll("[A-Za-z]","");
        System.out.println(str1);
        System.out.println(str1.length());
    }
}
