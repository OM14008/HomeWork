package Class25;

import java.util.ArrayList;

public class E1ArrayList {
    public static void main(String[] args) {
        ArrayList<Car> cars = new ArrayList<>();
        Car car1 = new Car("Toyota","camry");
        Car car2 = new Car("Honda","Civic");
        Car car3 = new Car("BMW","17");
        cars.add(car1);
        cars.add(car2);
        cars.add(car3);


        for (Car c:cars) {
            c.printInfo();
        }
    }
}
class Car{
    String make;
    String model;
    Car(String name,String model){
        this.make=name;
        this.model=model;
    }
    void printInfo(){
        System.out.println(make+" "+model);
    }
}
