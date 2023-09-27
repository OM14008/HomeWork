package Class13;

public class E4StringTask2 {
    public static void main(String[] args) {
        String str= "Is it Saturday? Is it raining? Do we have a java class today?";
        char[] charArr = str.toCharArray();
        for (int i = 0; i < charArr.length; i++) {
            System.out.print(charArr[i]);
        }
    }
}
