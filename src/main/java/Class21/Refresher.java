package Class21;

public class Refresher {
    public static void main(String[] args) {
        int[] arr = {10,20,30};
        for(int s : arr){
            System.out.println(s);
        }
        String[] names = {"Vlad","Marina","Veronica"};
        for(String name:names){
            System.out.println(name.length());
        }
        Dog dog1 = new Dog("Lal","Black","Persian");
        Dog[] dogs = {dog1,new Dog("Papi","White","Chinese")};
        for(Dog dog:dogs){
            dog.printInfo();
        }






    }
}
