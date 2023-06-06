package HomeWorkClass29;
import java.lang.RuntimeException;
public class Age {
    public static void ageCheck(int num){
        if(num<16){
            throw new RuntimeException("Age is less then 16");
        }else{
            System.out.println("You are good to go");
        }
    }
    public static void main(String[] args){
        try {
            Age.ageCheck(15);
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
