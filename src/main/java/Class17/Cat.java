package Class17;

public class Cat {
    String name;
    Cat(String catName){
        System.out.println(" constructor number one");
    }
    /* the constructor with String data type is already exist;
     Cat(String breed){
        System.out.println(" constructor already exists");
    }*/
    Cat(String name,String color){
        System.out.println(" constructor number two");
    }
    Cat(int age){
        System.out.println(" constructor number three");
    }
    Cat(double weight){
        System.out.println(" constructor number four");
    }

    void printInfo(){
        System.out.println(name);
    }

    public static void main(String[] args) {
        Cat cat = new Cat("Tamil");
        cat.printInfo();
    }
}
