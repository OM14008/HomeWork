package HomeWorkClass20;

public class CreditCardTester {
    public static void main(String[] args) {

        CreditCard creditCard=new CreditCard(14879,8.5);
        Visa visa=new Visa(15245,12.4);
        AX ax = new AX(45784,8.7);

        System.out.println(creditCard.calculateInterest());
        System.out.println(visa.calculateInterest());
        System.out.println(ax.calculateInterest());
    }
}
