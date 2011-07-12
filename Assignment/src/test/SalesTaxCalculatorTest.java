package test;

import main.Item;
import main.SalesTaxCalculator;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class SalesTaxCalculatorTest {

    @Test
    public void shouldReturnSalesTaxAs0Point5ForImportedBoxOfChocolateCosting10Point0(){
        //Arrange
        Item item = new Item("imported box of chocolates", 10.0, true);

        //Act
        double salesTaxOnItem = SalesTaxCalculator.getSalesTaxOnItem(item);

        //Assert
        assertThat(0.5, is(salesTaxOnItem));
    }

    @Test
    public void shouldReturnSalesTaxAs7Point15ForImportedBottleOfPerfumeCosting47Point5(){
        //Arrange
        Item item = new Item("imported bottle of perfume", 47.5, true);

        //Act
        double salesTaxOnItem = SalesTaxCalculator.getSalesTaxOnItem(item);

        //Assert
        assertThat(7.15, is(salesTaxOnItem));
    }

    @Test
    public void shouldReturnSalesTaxAsZeroForBookCosting12Point49(){
        //Arrange
        Item item = new Item("book", 12.49, false);

        //Act
        double salesTaxOnItem = SalesTaxCalculator.getSalesTaxOnItem(item);

        //Assert
        assertThat(0.0, is(salesTaxOnItem));
    }

    @Test
    public void shouldReturnSalesTaxAs1Point65ForMusicCdCosting16Point49(){
        //Arrange
        Item item = new Item("music CD", 16.49, false);

        //Act
        double salesTaxOnItem = SalesTaxCalculator.getSalesTaxOnItem(item);

        //Assert
        assertThat(1.65, is(salesTaxOnItem));
    }

}
