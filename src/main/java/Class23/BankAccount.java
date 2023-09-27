package Class23;

public class BankAccount {
    String firstName;
   private String userName;
   private String password;
   private double accountBalance=120;

    public BankAccount(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }
    String getFirstName(){
        return firstName;
    }
    public double getAccountBalance(String password){
        if(password.equals(this.password)) {
            return accountBalance;
        }else{
            return 0;
        }
    }
    public void setAccountBalance(double balance){
        accountBalance=balance;
    }
    public void setPassword(String password){
        this.password=password;
    }
    public String getPassword(){
        return password;
    }
}

class BankTester{
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount("user123","password4567");
        System.out.println(bankAccount.getAccountBalance("password4567"));
        bankAccount.setAccountBalance(10000);
        System.out.println(bankAccount.getAccountBalance("password4567"));
        bankAccount.setPassword("123");
        System.out.println(bankAccount.getPassword());
    }
}