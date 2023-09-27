package Class28;

public class exceptionHW {
    public static void main(String[] args) {


        try {
            int[] a = {1};
            System.out.println(a[4]);
        } catch (ArrayIndexOutOfBoundsException e){
           System.out.println(e.getClass());
           // e.printStackTrace();
            //e.getLocalizedMessage();
           // e.getStackTrace();
            Class<?> w = e.getClass();
            System.out.println(w);
        }
            }
        }
