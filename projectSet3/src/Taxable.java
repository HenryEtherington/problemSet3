public class Taxable {

    private double tax, money=12000;


    //Constructor method

    public double calcTax(double tax, double money) {

        tax = 0.04 * money;
        return tax;
    }
}
