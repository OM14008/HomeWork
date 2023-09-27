package Class12;

public class Car {
    String make;
    String color;
    int year;
    int doors;
    String model;
    int mileage;
    boolean isAutomatic;



    void startCar() {
        System.out.println("Starting the engine of a "+model+".....");
    }
    void turn() {
        System.out.println("Car starts turning....");
    }
    void drive() {
        System.out.println("Car starts to move...");
    }
    void stops() {
        System.out.println("Car is stopping..");
    }
}
