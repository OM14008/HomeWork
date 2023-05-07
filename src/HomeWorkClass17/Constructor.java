package HomeWorkClass17;

public class Constructor {
    String name;
    int age;
    double weight;
    boolean isAdult;
    private Constructor(String name){
        this.name=name;
    }
     Constructor(int age){
        this.age=age;
    }
    protected Constructor(double weight){
        this.weight=weight;
    }
    public Constructor(boolean isAdult){
        this.isAdult=isAdult;
    }
    Constructor constructor=new Constructor("John");
}
