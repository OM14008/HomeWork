package Practice;

public class Practice4 {
    public static void main(String[] args) {

        int number = 8;

        if(number<=5) {
            System.out.println("It is a weekday");
        } else if(number==6||number==7) {
            System.out.println("It is weekend");
        } else {
            System.out.println("Invalid day");
        }
        int a,b,c;
        a=0;
        b=1;
        for(int i=0;i<10;i++){
            System.out.println(a);
            c=a+b;
            a=b;
            b=c;
        }

    }
}
