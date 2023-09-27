package Class21;

public class SchoolStudents extends Student {
    public SchoolStudents(String name,int age,String ID) {
        super(name, age, ID);
    }

    @Override
    void walk() {
        System.out.println("school students walk");
    }

    @Override
    void study() {
        System.out.println("School students sudy math");
    }

    @Override
    void rest() {
        System.out.println("school students are resting at home");
    }
    void fight(){
        System.out.println("school students are fighting");
    }
}
