package main;

public class SalesTaxCalculator {


    public SalesTaxCalculator() {

    }

    public static double getSalesTaxOnItem(Item item) {
        double salesTaxOnItem;

        if ((item.getImported() == true) && (item.checkWhetherItemIsBasicSalesTaxExemptableOrNot() == true)) {
            salesTaxOnItem = 0.05 * item.getShelfPrice();

        } else if ((item.getImported() == true) && (item.checkWhetherItemIsBasicSalesTaxExemptableOrNot() == false)) {
            salesTaxOnItem = 0.15 * item.getShelfPrice();

        } else if ((item.getImported() == false) && (item.checkWhetherItemIsBasicSalesTaxExemptableOrNot() == true)) {
            salesTaxOnItem = 0.0;

        } else {
            salesTaxOnItem = 0.1 * item.getShelfPrice();
        }

        salesTaxOnItem = Math.ceil(salesTaxOnItem * 20) / 20;
        return salesTaxOnItem;
    }
}




