package Class12;

public class CarObject {
    public static void main(String[] args) {

        Car car = new Car();
        car.make = "Ford";
        car.color = "black";
        car.year = 2017;
        car.doors = 2;
        car.model = "F150";
        car.isAutomatic = true;

        car.drive();
        car.stops();
        car.turn();


        Car car1 = new Car();
        car1.make = "Tesla";
        car1.model = "S";
        car1.isAutomatic = true;


        car.startCar();


    }
}
