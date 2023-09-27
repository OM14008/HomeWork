package Class29;

public class E1Methods {
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            System.out.println("hello world");
        }for (int i = 0; i < 3; i++) {
            System.out.println("hello java");
        }for (int i = 0; i < 3; i++) {
            System.out.println("hello batch1 16");
        }
        System.out.println("--------------------------------");
        //-------------------OR--we can use a method we create and called printWord-------------------
        printWord("hello world");
        printWord("hello java");
        printWord("hello batch 16");




    }
    static void printWord(String word){
        for (int i = 0; i < 3; i++) {
            System.out.println(word);
        }
    }
}
