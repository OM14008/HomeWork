package Review9;

public class ENT extends Doctor{
    String location;
    ENT(String firstName,String lastname,String speciality,String location){
        super(firstName,lastname,speciality);
        this.location=location;
    }
    @Override
    void prescribeMedicine(String medicine){
        System.out.println("ENT doctors prescribe "+medicine+" when...");
    }
    protected void inspects(String bodyPart){
        System.out.println("ent doctor checks "+bodyPart);
    }
}
