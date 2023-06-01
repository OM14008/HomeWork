package HomeWorkClass24;

public class RepeatingCharacter {
    public static void main(String[] args) {
        Repeat obj = new Repeat();
        System.out.println(obj.nonRepeat("abracadabra"));
    }
}
    class Repeat {
        public String nonRepeat(String word) {
            StringBuilder str = new StringBuilder(word);
            for (int i = 0; i < str.length(); i++) {
                for (int j = 0; j < word.length()-1; j++) {
                    if(str.charAt(i)!=str.charAt(j)){
                        str.deleteCharAt(i);

                    }
                }


            }
            return str.toString();
        }

    }