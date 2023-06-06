package HomeWorkClass29;

public class NameLengthCheck {
    public static void nameLength(String name){
        if(name.length()<5){
            throw new RuntimeException("Your name does not match our records");
        }else{
            System.out.println("name matches");
        }
    }
    public static void main(String[] args){
        try {
            NameLengthCheck.nameLength("Anna");
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
