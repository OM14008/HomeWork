package HomeWorkClass21Java;

public class Dell extends Computer {
    Dell(String computerMake,String color,String SN,double price){
        super(computerMake,color,SN,price);

    }
    @Override
    void bootingUp(){
        super.bootingUp();
        System.out.println("Dell bootingUp in 12sec");
    }
    @Override
    void shutsDown(){
        super.processData();
        System.out.println("Dell is off");
    }
    @Override
    void processData(){
        super.shutsDown();
        System.out.println("Dell is processing data");

    }
}
