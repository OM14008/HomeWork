package HomeWorkClass16;

public class ReversedStringMethod {
   static String reverse(String word){
        String reversed = "";
        for (int i = word.length()-1; i >= 0 ; i--) {
            reversed=reversed+word.charAt(i);
        }
        return reversed;
    }
}
