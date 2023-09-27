package Class20;

public class Dog extends Animal{
        Dog(String name,String color,String breed,int age,double weight) {
            super(name, color, breed, age, weight);
        }//even tho we have constructor we still have to
         //set the parameters and call the constructor from
         //parent class using SUPER keyword

           @Override
            void sleep() {
                System.out.println("I like to sleep fo 10H");
            }//we can create method inside the class
             // and java will prefer this method first
        }    // if method is overridden you can't change return type
             // in method overriding parameters has to stay the same
             //Method overriding is when the subclass has exact same method as parent but
             // in different implementation
//benefits of method overriding is: /flexibility,cleaner coding.
//rules1: if we want to override a method in the child class return type, method name and parameters they must be
//the same. rule2:private methods cannot be overridden.rule3 we can't override constructors.rule4 static methods
//
