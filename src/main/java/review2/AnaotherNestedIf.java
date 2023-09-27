package review2;

public class AnaotherNestedIf {
    public static void main(String[] args) {
        boolean vaccine = false;
        int dose = 2;

        if(vaccine) {

            if(dose==1) {
                System.out.println("You need second dose");
            } else if(dose==2) {
                System.out.println("You are fully vaccinated");
            } else if(dose==3) {
                System.out.println("you are fully vaccinated with booster");
            }
        } else {
            System.out.println("you need a vaccine");
        }
    }
}
