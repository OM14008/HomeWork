package HomeWorkClass21Java;

public class Lenovo extends Computer {
    Lenovo(String computerMake,String color,String SN,double price){
       super(computerMake,color,SN,price);

    }
    @Override
    void bootingUp(){
        super.bootingUp();
        System.out.println("Lenovo bootingUp in 15sec");
    }
    @Override
    void shutsDown(){
        super.processData();
        System.out.println("Lenovo is off");
    }
    @Override
    void processData(){
        super.shutsDown();
        System.out.println("Lenovo is processing data");
    }
}
