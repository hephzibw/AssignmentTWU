package main;

public class SalesTaxCalculator {



    public SalesTaxCalculator() {}

    public double getActualSalesTaxOnItem(Item item)
    {
            if(item.getImported()==true)
                 {if(item.checkWhetherItemIsExempted()==true)
                    return 0.05*item.getCost();
                   else
                    return 0.15*item.getCost();
                 }
            else
                 {if(item.checkWhetherItemIsExempted()==true)
                    return 0.0;
                   else
                    return 0.1*item.getCost();
                 }
    }


}
