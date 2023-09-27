package Class28;

public class E5Exception {
    public static void main(String[] args) {
        System.out.println("1");
        System.out.println("2");
        System.out.println("3");

        try {
            System.out.println(10 / 0);}
           // "".charAt(10);}
        //int[] arr = new int[-5];}
        catch(ArithmeticException e){
                System.out.println("someone try to divide by zero");
            }
        catch(NegativeArraySizeException e){
            System.out.println("someone is trying to create array of negative size");
        }
        catch(Exception e){
            System.out.println("Something went wrong executing back up code");
        }
        System.out.println("4");
    }
}
