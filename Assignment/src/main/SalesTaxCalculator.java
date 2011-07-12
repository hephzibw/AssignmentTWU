package main;

public class SalesTaxCalculator {


    public SalesTaxCalculator() {

    }

    public static double getSalesTaxOnItem(Item item) {
        double tax;

        if ((item.getImported() == true) && (item.checkWhetherItemIsExempted() == true)) {

            tax = Math.ceil(0.05 * item.getShelfPrice() * 20) / 20;

        } else if ((item.getImported() == true) && (item.checkWhetherItemIsExempted() == false)) {

            tax =  Math.ceil(0.15 * item.getShelfPrice() * 20) / 20;
        } else if ((item.getImported() == false) && (item.checkWhetherItemIsExempted() == true)) {

            tax =  0.0;
        } else {

           tax =  Math.ceil(0.1 * item.getShelfPrice() * 20) / 20;
        }

      
        return tax;
    }
}




