package HomeWorkClass21Java;

public class ComputerTester {
    public static void main(String[] args) {

        Computer[] arr = {new Apple("Apple","white","fgh1254",1456),
                          new Dell("Dell","grey","ioo1568",1230),
                          new HP("HP","black","asd1245",980),
                          new Lenovo("Lenovo","silver","wer78965",583)};
        for(Computer computer:arr){
            System.out.println(computer.computerMake+" "+computer.color+" "+computer.SN+" "+computer.price);
            computer.bootingUp();
            computer.processData();
            computer.shutsDown();
        }
    }
}
