package Class15;

public class SyntaxEmployee {
    String empId;
    double salary;
    final static String CEO = "Sumair";
    public static void main(String[] args) {
        SyntaxEmployee John = new SyntaxEmployee();
        John.empId = "125487";
        John.salary = 90000;
        System.out.println(SyntaxEmployee.CEO+" "+ John.empId+" "+John.salary);
        SyntaxEmployee Keran = new SyntaxEmployee();
        Keran.empId="458gfd";
        Keran.salary=89000;
        System.out.println(SyntaxEmployee.CEO+" "+Keran.empId+" "+Keran.salary);
    }

}
