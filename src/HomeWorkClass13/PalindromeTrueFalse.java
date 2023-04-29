package HomeWorkClass13;

public class PalindromeTrueFalse {
    public static void main(String[] args) {
        String word = "racercar";
        boolean isPalindrome = true;
        for (int i = 0; i < word.length(); i++) {
            if(word.charAt(i) != word.charAt(word.length()-i-1)) {
                isPalindrome = false;
                break;
            }
        }
        if(isPalindrome) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}
