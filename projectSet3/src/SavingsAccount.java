import javax.swing.*;

public class SavingsAccount {

    private double balance;

    public SavingsAccount() {

         this.balance = 2300;

     }

     //one argument constructor
    public SavingsAccount( double balance){

         setBalance(balance);
     }


     //Accessor Methods

     public void setBalance ( double balance){
         this.balance = balance;
     }


     //Mutator methods

     public double getBalance ( double balance){
         return balance;
     }

     //Constructor method

     public void CalcSavings () {
         JOptionPane.showMessageDialog(null, "Balance: " + balance);
     }
 }




