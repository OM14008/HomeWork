package Class12;

public class DogTester {
    public static void main(String[] args) {

        Dog actualDog = new Dog();
        actualDog.name = "Jacky";
        actualDog.age = 15;
        actualDog.bread = "German";
        actualDog.color = "Black";
        actualDog.weight = 50;

        actualDog.bark();

        Dog obj = new Dog();
        obj.name = "Snoopy";
        obj.age = 10;
        obj.color = "White";
        obj.bread = "Doberman";
        obj.weight = 45;


        obj.bark();


    }
}
