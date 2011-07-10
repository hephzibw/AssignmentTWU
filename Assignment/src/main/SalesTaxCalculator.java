package main;

public class SalesTaxCalculator {
    private Item item;
    private boolean exempted;

    public SalesTaxCalculator(Item item,boolean exempted){
        this.item=item;
        this.exempted=exempted;
    }

    public SalesTaxCalculator() {}

    public double getActualSalesTaxOnItem()
    {
            if(item.getImported()==true)
                 {if(exempted==true)
                    return 0.05*item.getCost();
                   else
                    return 0.15*item.getCost();
                 }
            else
                 {if(exempted==true)
                    return 0.0;
                   else
                    return 0.1*item.getCost();
                 }
    }

    public Item getItem(){
        return item;
    }
    
}
