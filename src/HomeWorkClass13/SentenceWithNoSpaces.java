package HomeWorkClass13;

public class SentenceWithNoSpaces {
    public static void main(String[] args) {
        String sentence = "It is a sunny day but I am stuck learning Java";
        String sentenceNoSpace = sentence.replaceAll(" ","");
        System.out.println(sentenceNoSpace);
    }
}
