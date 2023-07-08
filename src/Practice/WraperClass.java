package Practice;

public class WraperClass {
    public static void main(String[] args) {
        String rev = reverse("I am a java Programmer");
        System.out.println(rev);
    }
    public static String reverse(String strToRev){
        String[] w = strToRev.split(" ");
        String b = " ";
        for(int i=w.length-1;i>=0;i--){
            b+=w[i]+" ";
        }
        return b;
    }
}

