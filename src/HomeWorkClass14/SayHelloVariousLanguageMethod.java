package HomeWorkClass14;

public class SayHelloVariousLanguageMethod {
    String word (String str) {
        String word = "";
        switch(str) {
            case "English":
                word = "Hello";
                break;
            case "French":
                word = "Bonjour";
                break;
            case "Spanish":
                word = "Hola";
        }

        return word;
    }

    public static void main(String[] args) {
        SayHelloVariousLanguageMethod hello = new SayHelloVariousLanguageMethod();
        String language = hello.word("French");
        System.out.println(language);
    }

}
