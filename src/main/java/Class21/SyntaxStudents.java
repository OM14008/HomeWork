package Class21;

public class SyntaxStudents extends Student {
    public SyntaxStudents(String name,int age,String ID) {
        super(name, age, ID);
    }
    @Override
     void study(){
        System.out.println("study Java");
    }
    @Override
    void rest(){
        System.out.println("Syntax students rest before class");
    }
    @Override
    void walk(){
        System.out.println("Syntax students walk in to the class ");
    }
    void havingBreak(){
        System.out.println("Syntax students have a break");
    }
}
