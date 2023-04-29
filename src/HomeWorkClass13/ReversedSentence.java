package HomeWorkClass13;

public class ReversedSentence {
    public static void main(String[] args) {
            String  sentence = "This is sentence I want to reverse";
            String[] words = sentence.split(" ");
            for (String word : words) {
            StringBuilder Element = new StringBuilder(word);
            StringBuilder reverseElement = Element.reverse();
            System.out.print(reverseElement+" ");
        }








    }
}
