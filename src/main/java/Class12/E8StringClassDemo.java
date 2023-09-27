package Class12;

public class E8StringClassDemo {
    public static void main(String[] args) {

        String sentence = "  Java is very very easy";
        sentence = sentence.trim().toLowerCase();
        System.out.println(sentence);
        System.out.println(sentence.startsWith("Java"));
        System.out.println(sentence.startsWith("Python"));

    }
}
