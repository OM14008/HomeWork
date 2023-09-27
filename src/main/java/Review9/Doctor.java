package Review9;

public class Doctor {
    public String firstName, lastName;
    protected String speciality;
    int yearsOfExperience;
    private double salary;
    public static boolean degree;

    Doctor(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Doctor(String firstName, String lastName, String speciality) {
        this(firstName, lastName);
        this.speciality = speciality;
    }
    public void printInfo(){
        System.out.println("Doctors name is "+firstName+" "+lastName+". And speciality is "+speciality);
    }
    protected void treat(String firstName){
        System.out.println("Doctors treat patients");
    }
    protected  void treat(){
        System.out.println("treat patients");
    }
    void prescribeMedicine(String medicine){
        System.out.println("doctor prescribe "+medicine);
    }
    private double getSalary(){
        return salary;
    }


    public static void main(String[] args) {
        ENT ent = new ENT("John","snow","ent","MaryLand");
        ent.printInfo();
        ent.treat();
        ent.treat("John Wick");
        ent.prescribeMedicine("fulictose");
        ent.inspects("nose");
        Doctor ent1 = new ENT("John","Brown","ENT","MaryLand");//upcasting object
        ent1.printInfo();
        ent1.treat();
        ent1.treat("Jane Smith");
        ent1.prescribeMedicine("Some medicine");














    }
}