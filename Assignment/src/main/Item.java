package main;

import java.text.DecimalFormat;

public class Item {
    private String name;
    private double shelfPrice;
    private boolean imported;
    private boolean exempted;
    private double cost;

    public Item(String name, double shelfPrice, boolean imported) {
        this.name = name;
        this.shelfPrice = shelfPrice;
        this.imported = imported;
    }

    public String getName() {
        return name;
    }

    public double getShelfPrice() {
        return shelfPrice;
    }

    public boolean getImported() {
        return imported;
    }

    public boolean checkWhetherItemIsBasicSalesTaxExemptableOrNot() {
        if ((name.equals("book")) || (name.equals("chocolate bar")) || (name.equals("box of imported chocolates")) || (name.equals("imported box of chocolates")) || (name.equals("packet of headache pills")))
            exempted = true;
        else
            exempted = false;
        return exempted;
    }

    public double getCostOfItem() {
        double salesTaxOnItem = SalesTaxCalculator.getSalesTaxOnItem(this);
        cost = shelfPrice + salesTaxOnItem;
        DecimalFormat currencyFormat = new DecimalFormat("#.##");
        cost = Double.parseDouble(currencyFormat.format(cost));
        return cost;
    }
}
