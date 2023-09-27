package Class19;

public class Animal {
    String name;
    String color;
    String breed;
    int age;
    double weight;

    public Animal(String name, String color, String breed, int age, double weight) {
        this.name = name;
        this.color = color;
        this.breed = breed;
        this.age = age;
        this.weight = weight;
    }

    void printInfo(){
        System.out.println(name+" "+color+" "+breed+" "+age+" "+weight);

    }
}
