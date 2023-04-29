package HomeWorkClass13;

public class swappingTwoStrings {
    public static void main(String[] args) {
        String name = "John";
        String name1 = "Audry";
        name = name+name1;
        name1 = name.substring(0,name.length()-name1.length());
        name = name.substring(name1.length());
        System.out.println(name+name1);

    }
}
