package Class18;

public class VehicleTester {
    public static void main(String[] args) {
        Audi audi =new Audi();
        audi.color="Black";
        System.out.println(audi.color);
        audi.drive();
        BMW bmw = new BMW();
        bmw.offerMPackage();
    }
}
