package HomeWorkClass24;

import java.nio.charset.StandardCharsets;

public class NumberOfWords {
    public static void main(String[] args) {
        String str = "Hello, World";
        String[] word = str.split(" ");
        int spaceCount = word.length;
        System.out.println(spaceCount);
    }
}
