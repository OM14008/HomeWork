package Class21;

public class E1PolyMorphism {
    public static void main(String[] args) {


        Animal[] animals = {new Horse("Brady", "Black", "English"),
                new Dog("Shaggy", "Black", "German"),
                new Cat("Tom", "Blue", "Persian")};

        for (Animal animal : animals) {
         animal.speak();
         animal.eat();
         animal.sleep();
        }
        Animal animal= new Dog("Shaggy", "Black", "German");
        Dog d = (Dog)animal;// calling specific method from Dog class using type casting
        d.run();
        ((Dog)animal).run();//direct way without using variable
    }
}
