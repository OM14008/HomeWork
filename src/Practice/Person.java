package Practice;


    class Person{
        String name;
        String lastName;
        int age;




        Person(String name,String lastName,int age){
            this.name=name;
            this.lastName=lastName;
            this.age=age;
        }

        void printInfo(){
            System.out.println(name+" "+lastName+" "+age);
        }
    }

class Employee extends Person{
    int salary;
    Employee(String name,String lastName,int age,int salary){
        super(name,lastName,age);
        this.salary=salary;
    }
    void printInfo(){
        super.printInfo();
        System.out.print(" "+salary);
      }
    }

    class Main {
    public static void main(String[] args){
        Employee employee = new Employee("Joe","Smith",35,35000);
        employee.printInfo();



    }

}
