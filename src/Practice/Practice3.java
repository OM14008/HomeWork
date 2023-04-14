package Practice;

import java.util.Scanner;

public class Practice3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the radius value of the circle: ");
        double radius = scanner.nextDouble();
        System.out.println("enter the diameter value of the circle: ");
       // double diameter = scanner.nextDouble();
       // System.out.println("enter the circumference value of the circle: ");
       // double circumference = scanner.nextDouble();
       // System.out.println("enter the area of the circle");
        //double area = scanner.nextDouble();



        double mathPi = 3.14159;
        double diameter = radius+radius;
        double circumference = 2*mathPi*radius;
        double area = mathPi*radius*radius;
        System.out.println( "The diameter of the circle is: "+diameter+"\n"+
                            "The circumference of the circle is: "+circumference+"\n"+
                            "The area of the circle is: "+area);



    }

}
