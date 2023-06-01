package HomeWorkClass24;

public class PalindromeString {
    public static void main(String[] args) {
        String word ="madam";
        StringBuilder word2 = new StringBuilder(word);
        StringBuilder reverse = word2.reverse();
        String reversed = reverse.toString();
        if(reversed.equals(word)){
            System.out.println("the word is palindrome");
        }else{
            System.out.println("false");
        }
    }
}
