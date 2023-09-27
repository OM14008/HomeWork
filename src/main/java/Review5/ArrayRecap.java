package Review5;

public class ArrayRecap {
    public static void main(String[] args) {

        String[] languages = {"English", "Spanish", "french", "German", "Chines", "Japanese"};
        for (String language : languages) {
            System.out.print(language+" ");
        }
        System.out.println();
        for(int i= languages.length-1;i>=0;i--) {
            System.out.print(languages[i]+" ");
        }
    }
}
