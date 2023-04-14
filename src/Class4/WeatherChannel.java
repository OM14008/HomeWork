package Class4;

import java.util.Scanner;

public class WeatherChannel {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the city:");
        String city = scanner.nextLine();
        System.out.println("Enter the temperature in Fahrenheit");
        int tempInFahrenheit = scanner.nextInt();

        tempInFahrenheit = (tempInFahrenheit-32)*5/9;


        System.out.println("The temperature is "+tempInFahrenheit+" Degrees Celsius "+"in the city of "+city);

    }
}
