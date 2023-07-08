package Practice;

public class ConsecutiveDuplicates {
        public static void main(String[] args) {
            String str = "aabbcde";
            String newStr=removeConsecutiveDuplicates(str);
            System.out.println(newStr);
        }
        public static String removeConsecutiveDuplicates(String input) {
            StringBuilder newStr = new StringBuilder();
            for (int i = 0; i < input.length(); i++) {
                if (i == 0 || input.charAt(i) != input.charAt(i - 1)) {
                    newStr.append(input.charAt(i));
                }
            }
            return newStr.toString();
        }
    }


