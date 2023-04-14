package Practice;

import java.util.Scanner;

public class monthOfBirth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your birth month");
        String month = scanner.next();

        if(month.equals("March")||month.equals("April")||month.equals("May")) {
            System.out.println("The season is Spring");
            System.out.println("You were born in the season of Spring");
        } else if(month.equals("June")||month.equals("July")||month.equals("August")) {
            System.out.println("The season is Summer");
            System.out.println("You were born in the season  of Summer");
        } else if(month.equals("September")||month.equals("October")||month.equals("November")) {
            System.out.println("The season is Fall");
            System.out.println("You were born in the season of Fall");
        } else if(month.equals("December")||month.equals("January")||month.equals("February")) {
            System.out.println("The season is Winter");
            System.out.println("You were born in the season of Winter");
        }

    }
}
