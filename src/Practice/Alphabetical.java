package Practice;

public class Alphabetical {
    public static void main(String[] args) {
        String word = "hello";
        String character = "";
        char letter1 = word.charAt(0);

        for (int i = 0; i < word.length()-1; i++) {
            char char1 = word.charAt(i);
            char char2 = word.charAt(i+1);
            if(char1<char2){
                character+=char2;
            }
        }
        System.out.print(letter1+character);
    }
}
