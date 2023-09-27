package Class14;

import java.util.Locale;

public class Task1HWClass13 {

    boolean isPalindrome(String str) {
        boolean isPal = false;
        String reversedString = "";
        for (int i = str.length()-1; i >= 0; i--) {
            reversedString = reversedString + str.charAt(i);
            if (str.equalsIgnoreCase(reversedString)) {
                isPal=true;
            }
        }
        return isPal;
    }
     /* OR
    boolean isPal(String str) {
        return new StringBuilder(str).reverse().toString().equalsIgnoreCase(str);
    }*/
    public static void main(String[] args) {
        Task1HWClass13 obj = new Task1HWClass13();
        boolean result = obj.isPalindrome("Apple");
        System.out.println(result);
    }
}
