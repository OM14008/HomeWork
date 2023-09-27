package Class19;

public class Dog extends Animal {
    double price;
    public Dog(String name, String color, String breed, int age, double weight,double price){
       super(name,color,breed,age,weight);//calling constructor from parent class and assigning price to it
       this.price=price;
    }
    void printInfo(){
        super.printInfo(); //calling the method from parent class using SUPER keyword
        System.out.println(price);
    }

}


