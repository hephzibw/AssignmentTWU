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
        assertThat(0.5, is(SalesTaxCalculator.getSalesTaxOnItem(new Item("imported box of chocolates",10.0,true))));
    }

    @Test
    public void shouldReturnSalesTaxAs7Point15ForImportedBottleOfPerfumeCosting47Point5(){
        SalesTaxCalculator salesTaxCalculator=new SalesTaxCalculator();
        assertThat(7.15, is(SalesTaxCalculator.getSalesTaxOnItem(new Item("imported bottle of perfume",47.5,true))));
    }

    @Test
    public void shouldReturnSalesTaxAsZeroForBookCosting12Point49(){
        SalesTaxCalculator salesTaxCalculator=new SalesTaxCalculator();
        assertThat(0.0, is(SalesTaxCalculator.getSalesTaxOnItem(new Item("book",12.49,false))));
    }

    @Test
    public void shouldReturnSalesTaxAs1Point649ForMusicCdCosting16Point49(){
        SalesTaxCalculator salesTaxCalculator=new SalesTaxCalculator();
        assertThat(1.65, is(SalesTaxCalculator.getSalesTaxOnItem(new Item("music CD",16.49,false))));
    }

}
