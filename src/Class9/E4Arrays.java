package Class9;

import java.util.Scanner;

public class E4Arrays {
    public static void main(String[] args) {

        String[] name = {"Asghar", "Asel", "Moazam", "Samir", "Oleg"};

        for(int i=0; i<name.length; i++) {
            System.out.print(name[i]+" ");
        } System.out.println();

        int j=0;
        while(j<name.length) {
            System.out.print(name[j]+" ");
            j++;
        } System.out.println();

        for(int i =  0; i<5; i++ ) {
            if(i%2==0) {
                System.out.print(i+" ");
            }
        } System.out.println();

        char[] symbol = {'a','b','c','d','e' };

        for(int i=0;i< symbol.length; i+=2) {
            //if(i%2==0) {
                System.out.print(symbol[i]+" ");
           // }
        } System.out.println();

        int[] numbers = {10,50,60,45,100};
        for(int i=1;i<numbers.length;i+=2) {
            //if(i%2!=0) {
                System.out.print(numbers[i]+" ");
           // }
        } System.out.println();

        boolean[] flags = {true,false,true,false,false,true,false};
        int counter = 0;
        for (int i=0;i<flags.length;i++) {
            if(!flags[i]) {
                counter++;
            }
        }
        System.out.print(counter);
        System.out.println();

        for(int i=6;i>=0;i--) {
            System.out.print(i+" ");
        }
        System.out.println();

        char[] lt = {'A','B','C','D','E','F'};
        for (int i=5;i>=0; i--) {
            System.out.print(lt[i]+" ");
        }
        System.out.println();

        String[] confusedStudents={"Vlad","Veronica","Farwa","Halima","Lais"};
        for(String name1:confusedStudents){
            System.out.print(name1+" ");
        } System.out.println();

        int[] numbers1 = {45,50,20,30,-50,45};
        for(int number2:numbers1) {
            System.out.print(number2+" ");
        }
        System.out.println();

        int[] numbers3 = new int[5];
        numbers3[2]=50;
        numbers3[0]=100;
        numbers3[1]=54;
        numbers3[3]=45;
        numbers3[4]=21;
        for (int number : numbers3) {
            System.out.print(number+" ");
        }
        System.out.println();

        int[] numbers4 = new int[3];
        Scanner scanner = new Scanner(System.in);

        for(int i = 0; i< numbers4.length;i++) {
            System.out.println("Please enter int numbers");
            numbers4[i] = scanner.nextInt();
        }
        for (int number5 : numbers4) {
            System.out.print(number5+" ");
        }
    }
}












