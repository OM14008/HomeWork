package HomeWorkClass16;

public class ExtractingVowelsFromStringMethod {
    private static String vowels(String word){
        String lowerCase = word.toLowerCase();
        String vowels = "";
        for (int i = 0; i < lowerCase.length(); i++) {
            if(lowerCase.charAt(i)=='a'||lowerCase.charAt(i)=='e'||lowerCase.charAt(i)=='i'
                                  ||lowerCase.charAt(i)=='o'|| lowerCase.charAt(i)=='u'){
                 vowels += word.charAt(i);
            }
        }
        return vowels;

    }

    public static void main(String[] args) {
        System.out.println(ExtractingVowelsFromStringMethod.vowels("String"));

    }
}
