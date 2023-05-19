package HomeWorkClass21Java;

public class Computer {
    String computerMake;
    String color;
    String SN;
    double price;
    Computer(String computerMake,String color,String SN,double price){
        this.computerMake=computerMake;
        this.color=color;
        this.SN=SN;
        this.price=price;
    }

    void bootingUp(){
        System.out.println("Computer is ON");
    }
    void shutsDown(){
        System.out.println("Computer is OFF");
    }
    void processData(){
        System.out.println("Computer closing screen ");
    }

}
