package HomeWorkClass24;

public class Anagrams {
    public static void main(String[] args) {
        StringBuilder symbol = new StringBuilder();
        String str = "watermelon";
        String str1 = "apple";
        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j < str1.length(); j++) {
                if(str.charAt(i)==str1.charAt(j)){
                    symbol.append(str1.charAt(j));
                }
            }
        }
        String word = symbol.toString();
        System.out.println(word);
        if(word.equals(str)) {
            System.out.println("The words is Anagrams");
        }else{
            System.out.println("The words is not Anagrams");
        }

    }
}
