package HomeWorkClass20;

public class CreditCard {
    double balance;
    double interest;
    CreditCard(double balance, double interest){
        this.balance=balance;
        this.interest=interest;
    }
    double calculateInterest(){
        double interest = this.balance*this.interest;
        return interest;
    }
}
