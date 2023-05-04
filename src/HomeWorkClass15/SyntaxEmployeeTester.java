package HomeWorkClass15;

public class SyntaxEmployeeTester {
    public static void main(String[] args) {
      SyntaxEmployee obj = new SyntaxEmployee();
      obj.empID="458795";
      obj.salary=15456885;
      SyntaxEmployee obj2 = new SyntaxEmployee();
      obj2.empID="12546";
      obj2.salary=230000;
      System.out.println(obj.empID+"\n"+obj.salary+"\n"+obj.CEO);
      System.out.println(obj2.empID+"\n"+obj2.salary+"\n"+obj2.CEO);
    }
}
