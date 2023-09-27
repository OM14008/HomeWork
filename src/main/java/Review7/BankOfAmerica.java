package Review7;

public class BankOfAmerica {
    public static void main(String[] args) {
        BankAccount bank = new BankAccount();
        bank.accountHolder = "John Smith";
        bank.accountNumber = 4566842321L;
        bank.accBalance = 20;
        bank.ssn = 125487;
        System.out.println(BankAccount.bankName);
        BankAccount bank1 = new BankAccount();
        bank1.accountHolder = "James Smith";
        bank1.accountNumber = 4566455871L;
        bank1.accBalance = 50;
        bank1.ssn = 1254786487;
        System.out.println(bank1.bankName); // not a good way to access static variable
    }
}
