package HomeWorkClass21Java;

public class Apple extends Computer {

    Apple(String computerMake,String color,String SN,double price){
       super(computerMake,color,SN,price);
    }
    @Override
    void bootingUp(){
        super.bootingUp();
        System.out.println("Apple bootingUp in 10sec");
    }
    @Override
    void shutsDown(){
        super.processData();
        System.out.println("Apple is off");
    }
    @Override
    void processData(){
        super.shutsDown();
        System.out.println("Apple is processing data");
    }
}
