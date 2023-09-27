package Review5;

public class Task6 {
    public static void main(String[] args) {

        int num = 30;
        boolean isPrime = true;

        if(num>1) {
            for (int i = 2; i < num; i++) {
                if(num%i==0) {
                    isPrime=false;
                    break;
                }
            }
        } else {
            isPrime = false;
        }
        if(isPrime) {
            System.out.println(num+ "is a prime number");
        } else {
            System.out.println(num+ "is not a prime number");
        }
















    }
}
