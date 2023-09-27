package Class7;

public class E11WhileLoop {
    public static void main(String[] args) {
      /*  int counter1 = 100;
        while(counter1>=1) {
            System.out.print(counter1+" ");
            counter1--;
        }*/
      /*  int counter1 = 20;
        while(counter1<=100) {
            System.out.print(counter1+" ");
            counter1+=2;
        }*/
      /*  int counter2 =100;
        while(counter2>=1) {
            if(counter2%2==1) {
                System.out.print(counter2+" ");
            }
            counter2--;
        } */
        int counter = 1;
        int sum = 0;
        while(counter<=10) {
            sum+=counter;
            counter++;
        }
        System.out.println(sum);
    }
}
