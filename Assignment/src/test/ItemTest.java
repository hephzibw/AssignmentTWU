package test;

import main.Item;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ItemTest {


    @Test
    public void testingTheConstructor() {
        //Arrange
        Item item = new Item("Box of Chocolates", 10.0, true);


        String name = item.getName();
        double shelfPrice = item.getShelfPrice();
        boolean imported = item.getImported();
        assertThat("Box of Chocolates", is(name));

        assertThat(10.0, is(shelfPrice));

        assertThat(true, is(imported));
    }

    @Test
    public void shouldReturnTheValueForExemptedAsTrueForBook() {
        Item item = new Item("book", 12.45, false);
        assertThat(true, is(item.checkWhetherItemIsBasicSalesTaxExemptableOrNot()));
    }

    @Test
    public void shouldReturnTheValueForExemptedAsFalseForMusicCD() {
        Item item = new Item("music CD", 12.0, false);
        assertThat(false, is(item.checkWhetherItemIsBasicSalesTaxExemptableOrNot()));
    }

    @Test
    public void shouldReturnTheValueForExemptedAsFalseForBottleOfPerfume() {
        Item item = new Item("bottle of perfume", 12.45, false);
        assertThat(false, is(item.checkWhetherItemIsBasicSalesTaxExemptableOrNot()));
    }

    @Test
    public void shouldReturnTheValueForExemptedAsTrueForImportedBoxOfChocolates() {
        Item item = new Item("imported box of chocolates", 60.56, true);
        assertThat(true, is(item.checkWhetherItemIsBasicSalesTaxExemptableOrNot()));
    }

    @Test
    public void shouldCalculateCostOfImportedBottleOfPerfumeCosting27Point99As32Point19(){
        Item item=new Item("imported bottle of perfume",27.99,true);
        assertThat(32.19, is(item.getCostOfItem()));

    }

}

