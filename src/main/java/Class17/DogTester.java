package Class17;

public class DogTester {
    public static void main(String[] args) {
      /*  Dog obj = new Dog();
        obj.name="Jack";
        obj.color="black";
        obj.breed="lab";
        obj.age=5;
        obj.printInfo();

        Dog obj1 = new Dog();
        obj1.name="Jack";
        obj1.color="black";
        obj1.breed="lab";
        obj1.age=5;
        obj1.printInfo();

        Dog obj2 = new Dog();
        obj2.name="Jack";
        obj2.color="black";
        obj2.breed="lab";
        obj2.age=5;
        obj2.printInfo();

        Dog obj4 = new Dog();
        obj4.name="Jack";
        obj4.color="black";
        obj4.breed="lab";
        obj4.age=5;
        obj4.printInfo();

        Dog obj5 = new Dog();
        obj5.name="Jack";
        obj5.color="black";
        obj5.breed="lab";
        obj5.age=5;
        obj5.printInfo();*/

        Dog dog1=new Dog("Jack","black","persian",12);
        Dog dog2=new Dog("Shagy","white","husky",5);
        Dog dog3=new Dog("Bolto","pink","british",6);
        Dog dog4=new Dog("Papi","brown","german",8);
        Dog dog5=new Dog("Ace","brown","spanish",2);
        dog1.printInfo();
        dog2.printInfo();
        dog3.printInfo();
        dog4.printInfo();
        dog5.printInfo();
    }
}
