
import javax.swing.*;

public abstract class BankAccount implements Transactable {

        String name;
        int accNum;

public BankAccount(String name, int accNum) {

    this.name = name;
    this.accNum = accNum;
}
        //Abstract methods


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = "John";
    }

    public int getAccNum() {
        return accNum;
    }

    public void setAccNum(int accNum) {
        this.accNum = 1001;
    }

    //Constructor method
        public void Action ( ) {

            double a;
            String action, aAsString;

            action = JOptionPane.showInputDialog("Please enter an action");


            if (action.equals("lodge")) {
                aAsString = JOptionPane.showInputDialog("Please enter lodge amount");
                a = Double.parseDouble(aAsString);

                JOptionPane.showMessageDialog(null, "lodged amount\n" + a);

            } else if (action.equals("withdraw")) {
                aAsString = JOptionPane.showInputDialog("Please enter withdraw amount");
                a = Double.parseDouble(aAsString);

                JOptionPane.showMessageDialog(null, "withdrawn amount\n" + a);

            } else {
                JOptionPane.showMessageDialog(null, "Incorrect value entered");
            }
        }



    @Override

     public String toString() {

      return   "Name: " + name + "Account Number: " + accNum ;

    }
}

