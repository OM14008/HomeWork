package HomeWorkClass21Java;

public class HP extends Computer {
    HP(String computerMake,String color,String SN,double price){
        super(computerMake,color,SN,price);

    }
    @Override
    void bootingUp(){
        super.bootingUp();
        System.out.println("HP bootingUp in 12sec");
    }
    @Override
    void shutsDown(){
        super.processData();
        System.out.println("HP is off");
    }
    @Override
    void processData(){
        super.shutsDown();
        System.out.println("HP is processing data");
    }

}
