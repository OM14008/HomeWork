package HomeWorkClass14;

public class GivenNumberPrimeTrueFalseMethod {
    boolean isPrime(int num) {
        for (int i = 2; i < Math.sqrt(num); i++) {
            if(num%i==0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        GivenNumberPrimeTrueFalseMethod obj = new GivenNumberPrimeTrueFalseMethod();
        boolean isPrime = obj.isPrime(48);
        System.out.println(isPrime);
    }
}
