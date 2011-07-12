package test;

import main.Item;
import main.SalesTaxCalculator;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class SalesTaxCalculatorTest {

    @Test
    public void shouldReturnSalesTaxAs0Point5ForImportedBoxOfChocolateCosting10Point0(){
        SalesTaxCalculator salesTaxCalculator=new SalesTaxCalculator();
        assertThat(0.5, is(salesTaxCalculator.getActualSalesTaxOnItem(new Item("Box of Chocolates",10.0,true))));
    }

    @Test
    public void shouldReturnSalesTaxAs7Point125ForImportedBottleOfPerfumeCosting47Point5(){
        SalesTaxCalculator salesTaxCalculator=new SalesTaxCalculator();
        assertThat(7.125, is(salesTaxCalculator.getActualSalesTaxOnItem(new Item("Bottle of Perfume",47.5,true))));
    }

    @Test
    public void shouldReturnSalesTaxAsZeroForBookCosting12Point49(){
        SalesTaxCalculator salesTaxCalculator=new SalesTaxCalculator();
        assertThat(0.0, is(salesTaxCalculator.getActualSalesTaxOnItem(new Item("Book",12.49,false))));
    }

    @Test
    public void shouldReturnSalesTaxAs1Point649ForMusicCdCosting16Point49(){
        SalesTaxCalculator salesTaxCalculator=new SalesTaxCalculator();
        assertThat(1.649, is(salesTaxCalculator.getActualSalesTaxOnItem(new Item("Music CD",16.49,false))));
    }
}
