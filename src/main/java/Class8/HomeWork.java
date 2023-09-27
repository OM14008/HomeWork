package Class8;

public class HomeWork {
    public static void main(String[] args) {

       //Print even numbers from 20 to 1(2 ways);
        int num = 20;
        while(num>=1) {
            System.out.print(num+" ");
            num--;
        }
        System.out.println();
        for(int i=20; i>=1; i--) {
            System.out.print(i+" ");
        }
        System.out.println();

        //Print odd numbers between 20 and 50(2 ways);

        int num2 = 20;
        while(num2<=50) {
            if(num2%2!=0) {
                System.out.print(num2+" ");
            }
            num2++;
        }
        System.out.println();
        for(int i=20; i<=50; i++) {
            if(i%2!=0) {
                System.out.print(i + " ");
            }
        }
    }
}
