package HomeWorkClass14;

public class GenerateEmailMethod {
     void generateEmail(String firstName,String lastName,String emailType) {
         String firstLower = firstName.toLowerCase();
         String lastLower = lastName.toLowerCase();
         String emailLower = emailType.toLowerCase();
         System.out.println(firstLower+lastLower+"@"+emailLower+".com");

    }

    public static void main(String[] args) {
        GenerateEmailMethod obj = new GenerateEmailMethod();
        obj.generateEmail("John","Snow","gmail");

    }
}
