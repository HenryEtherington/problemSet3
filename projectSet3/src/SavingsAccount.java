public class SavingsAccount {

    private double balance;


    public SavingsAccount() {

        this.balance = 2300;

    }

    //one argument constructor
    public SavingsAccount(double balance) {

        setBalance(balance);
    }


    //Accessor Methods

    public void setBalance(double balance) {
        this. balance =  balance;
    }


    //Mutator methods

    public double getBalance(double balance) {
        return balance;
    }

    //Constructor method

    @Override
    public String toString(){
        return "Balance: " + balance  ;
    }
}



