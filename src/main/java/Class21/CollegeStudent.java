package Class21;

public class CollegeStudent extends Student {
    public CollegeStudent(String name,int age,String ID) {
        super(name, age, ID);
    }

    @Override
    void rest() {
        System.out.println("College students rest");
    }

    @Override
    void walk() {
        System.out.println("college students are walking");
    }

    @Override
    void study() {
        System.out.println("college students are studying");
    }
    void eat(){
        System.out.println("college students having a breakfast");
    }
}
