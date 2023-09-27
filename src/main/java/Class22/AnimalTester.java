package Class22;

public class AnimalTester {
    public static void main(String[] args) {
       /* Dog dog = new Dog();
        Cat cat = new Cat();
        Horse horse = new Horse();
        dog.eat();
        dog.sleep();
        dog.speak();
        cat.eat();
        cat.sleep();
        cat.speak();
        horse.eat();
        horse.sleep();
        horse.speak();*/

//         Polymorphism
        //---------------------

        Animal[] animals={new Cat("Nooky","black","english"),
                          new Dog("Rex","White","german"),
                          new Horse("Spirit","black","american")};
        for(Animal animal:animals){
            animal.eat();
            animal.sleep();
            animal.speak();
            animal.printInfo();
        }
    }
}
