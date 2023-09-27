package Class17;

public class Person {
    int age;
    double weight;
    Person(int personAge, double personWeight){
        age=personAge;
        weight=personWeight;
        System.out.println("the age is "+age+" and the weight is "+weight);
    }
    Person(){
        System.out.println("zero arguments constructor");
    }
   static boolean drink(String name, int age){
        if(age<21&&name.length()==4){
           return false;
        }
        return true;
    }
}
